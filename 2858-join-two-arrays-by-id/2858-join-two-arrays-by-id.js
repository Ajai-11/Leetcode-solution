/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    let arr3=arr1.concat(arr2);
    let res={};
    for(const obj of arr3 ){
        if(!res[obj.id]){
            res[obj.id]=obj;
            continue;
        }
        res[obj.id]={...res[obj.id],...obj};
    }
    return Object.values(res);
};