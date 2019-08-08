/* 2. Bubble Sort
Define function: bubbleSort(numArray)
Use the bubble sort algorithm to sort the array.
Return the sorted array. */
function bubbleSort(numArray) {
    for(let j = 0; j < numArray.length; j++){ // iterate through the array n^2 times with both for loops.
        for (let i = 0; i < numArray.length; i++) {
            if(arr[i] > arr[i+1]){
                let newValue = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = newValue;
            }
        }
    }
    return numArray;
}

let arr = [1,5,2,6,7,4,2];
console.log(bubbleSort(arr));