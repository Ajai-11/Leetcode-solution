class Solution {
    public int[] separateDigits(int[] nums) {
      ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            ArrayList<Integer> temp = new ArrayList<>();
            while (num > 0) {
                temp.add(num % 10);
                num /= 10;
            }
            Collections.reverse(temp); 
            arr.addAll(temp);
        }
        return arr.stream().mapToInt(i -> i).toArray();

    }
}