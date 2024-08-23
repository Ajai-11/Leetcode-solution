class TimeLimitedCache {
    constructor() {
        this.cache = new Map();
    }

    /**
     * @param {number} key
     * @param {number} value
     * @param {number} duration - time until expiration in ms
     * @return {boolean} - returns true if an un-expired key already existed, otherwise false
     */
    set(key, value, duration) {
        const now = Date.now();
        const entry = this.cache.get(key);

        if (entry && entry.expirationTime > now) {
            // Update the value and expiration time
            this.cache.set(key, { value, expirationTime: now + duration });
            return true;
        }

        // Set the new value and expiration time
        this.cache.set(key, { value, expirationTime: now + duration });
        return false;
    }

    /**
     * @param {number} key
     * @return {number} - returns the value associated with the key if it's unexpired, otherwise -1
     */
    get(key) {
        const now = Date.now();
        const entry = this.cache.get(key);

        if (entry && entry.expirationTime > now) {
            return entry.value;
        }

        // Remove the expired key
        if (entry) this.cache.delete(key);
        return -1;
    }

    /**
     * @return {number} - returns the count of non-expired keys
     */
    count() {
        const now = Date.now();
        let count = 0;

        for (const [key, entry] of this.cache) {
            if (entry.expirationTime > now) {
                count++;
            } else {
                // Remove expired keys
                this.cache.delete(key);
            }
        }

        return count;
    }
}
