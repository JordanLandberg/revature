/* 5. Substring
Define function substring(someStr, startIndex, endIndex)
Return the substring contained between startIndex (inclusive) and endIndex (exclusive).
If incorrect input is entered, throw an exception stating the input was incorrect.
For example substring('hello', 0, 3) should give 'hel' */
function substring(someStr, startIndex, endIndex) {
    let arr = [];
    if (typeof (someStr) !== 'string') {
        return 'Invalid input';
    }
    for (const letter of someStr) {
        arr.push(letter);
    }
    let newArr = [];
    arr.forEach((ele, index) => {
        if (index >= startIndex && index < endIndex) {
            newArr.push(ele);
        }
    });
    return newArr.join('');
}

console.log(substring('hello', 0, 3));
console.log(substring(123214, 0, 3));
console.log(substring(null, 0, 3));
console.log(substring(undefined, 0, 3));