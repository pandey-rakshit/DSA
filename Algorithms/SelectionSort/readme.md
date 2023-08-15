# Selection Sort

Selection sort is a sorting algorithm that works by repeatedly finding the smallest element in an unsorted list and swapping it with the first element of the list. This process is repeated until the list is sorted.

Selection sort is a simple sorting algorithm, but it is not very efficient. Its time complexity is O(n^2), where n is the number of elements in the list. This means that the algorithm's running time grows quadratically with the size of the list.

## How does Selection Sort Works ?

```js
const list = [5, 2, 1, 8, 4];

/*

1. Find the smallest element in the list, which is 1.

2. Swap 1 with the first element of the list, which is 5.

*/

[1, 2, 5, 8, 4];

/*

3. Find the smallest element in the remaining list, which is 2.

4. Swap 2 with the second element of the list, which is 5.

*/

[1, 2, 4, 8, 5];

/*

5. Find the smallest element in the remaining list, which is 4.

6. Swap 4 with the third element of the list, which is 8.

*/

[1, 2, 4, 5, 8];

// 6. The list is now sorted.
```
