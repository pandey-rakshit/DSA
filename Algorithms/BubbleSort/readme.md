# Bubble Sort

Bubble sort algorithm is a sorting algorithm that sorts an array by comparing two adjacent element and swapping them if they are not in right order.

> **Note:** `Order` can be `ASC` or `DESC`

## How Bubble Sort works ?

Bubble sort compares the element from index 0 and if the 0th index value is greater than 1st index value, then the values get swapped and if the 0th index value is less than the 1st index value, then nothing happens.

Next, the 1st index value compares to the 2nd index value, and then the 2nd index value compares to the 3rd index value, and so on...

## Solutions

```js
// time-complexity O(n^2)

function bubbleSort(array) {
  const len = array.length;
  for (let i = 0; i < len; i++) {
    for (let j = 0; j < len - i - 1; j++) {
      if (array[j] < array[j + 1]) {
        const temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
      }
    }
  }
  return array;
}

/*  
There is an optimal solutions for the problem says - what if the array is already sorted ??
we are still checking and iterating the loop and time complexity is O(n^2)

Here in the optimal solution we can have a variable name isSwapped or anything that you preffer and initialy for every ith iteration it is set to false and every time we make a swap we change its value to true...

so that in case if the value isn't change or swapped it means the array is sorted so no need to execute ahead anymore.

*/

function optimisedBubbleSort(array) {
  const len = array.length;
  for (let i = 0; i < len; i++) {
    let isSwapped = false;
    for (let j = 0; j < len - i - 1; j++) {
      if (array[j] < array[j + 1]) {
        const temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
        isSwapped = true;
      }
    }
    if (isSwapped === false) {
      break;
    }
  }
  return array;
}
// The best case senario takes a time complexity of O(n)
```
