/* 1. Fibonacci
Define function: fib(n) 
Return the nth number in the fibonacci sequence. */
function fib(n) {
    let arr = []; // create an empty array that will later hold the fibonacci sequence
    for(let i = 0;i < n; i++) { // loop through the array 'n' times and populate the array with the fibonacci sequence
        if(i === 0 || i === 1){ // populate  the array with base values 0 and 1 based off of i
            arr.push(i);
        } else { // populate the array with all concurent values of the fibonacci sequence after 0 and 1
            arr.push(arr[i-1] + arr[i-2]);
        }
    }
    return arr[n-1]; // return the nth number of the fibonacci sequence
}

console.log(fib(5));
console.log(typeof(fib));