/* 7. Palindrome
Define function isPalindrome(someStr)
Return true if someStr is a palindrome, otherwise return false */
function isPalindrome(someStr) {
    let arr = [];
    for (const letter of someStr) {
        arr.push(letter);
    }
    for (let i = 0; i < parseInt((arr.length / 2).toFixed(0)); i++) {
        if(arr[i] !== arr[arr.length-i-1]){
            return false;
        }
    }
    return true;
}

console.log(`String: "racecar" is a palindrome: ${isPalindrome('racecar')}`);
console.log(`String: "blake" is a palindrome: ${isPalindrome('blake')}`);
console.log(`String: "peter" is a palindrome: ${isPalindrome('peter')}`);
console.log(`String: "shovel" is a palindrome: ${isPalindrome('shovel')}`);
console.log(`String: "anna" is a palindrome: ${isPalindrome('anna')}`);
console.log(`String: "radar" is a palindrome: ${isPalindrome('radar')}`);
console.log(`String: "stats" is a palindrome: ${isPalindrome('stats')}`);
console.log(`String: "rotor" is a palindrome: ${isPalindrome('rotor')}`);