/* 11. Splice Element
Define function spliceElement(someArr, index)
Splice the element at the provided index in the array.
*/
function spliceElement(someArr, index) {
    let arr = [];
    for (let i = 0; i < someArr.length; i++) {
        if(i !== index) {
            arr.push(someArr[i]);
        }
    }
    return arr;
}

let arr = [0,1,2,3,4,5,6,7,8,9,10];
console.log(spliceElement(arr,4));
console.log(spliceElement(arr,7));
console.log(spliceElement(arr,1));
console.log(spliceElement(arr,9));