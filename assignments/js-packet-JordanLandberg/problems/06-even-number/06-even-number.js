/* 6. Even Number
Define function: isEven(someNum)
Return true if even, false if odd.
Do not use % operator. */
function isEven(someNum) {
    let divided = someNum / 2;
    if(divided === +divided.toFixed(0)){
        return true;
    } else{
        return false;
    }
}

console.log(`The number 4 is even: ${isEven(4)}`);
console.log(`The number 5 is even: ${isEven(5)}`);
console.log(`The number 52 is even: ${isEven(52)}`);
console.log(`The number 24 is even: ${isEven(24)}`);
console.log(`The number 3 is even: ${isEven(3)}`);