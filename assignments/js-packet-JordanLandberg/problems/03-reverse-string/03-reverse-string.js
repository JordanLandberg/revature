/* 3. Reverse String
Define function: reverseStr(someStr)
Reverse and return the String. */
function reverseStr(someStr) {
    let newString = [];
    for (let iterator of someStr) {
        newString.unshift(iterator);
    }
    return newString.join('');
}

console.log(reverseStr("Pablo"));