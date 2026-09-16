# Arrays

- Data structure used to store multiple elements.
- Used by many algorithms.
- Arrays are indexed, meaning that each element in the array has an index, a number that says where in the array the element is located.
- Indexing start from 0 to (length of array - 1)
- For example, the array is [1, 2, 3, 5, 0]

| element | index |
|---------|-------|
| 1 | [0] |
| 2 | [1] |
| 3 | [2] |
| 5 | [3] |
| 0 | [4] |

- Initialization in Java
```
int[] arr = {1, 2, 3, 5, 0};
```

## Bubble Sort [Average - O(n²)]

Bubble sort is an algorithm that sorts an array from the lowest value to the highest value.

Let the unsorted array is [7, 12, 9, 11, 3]

- We look at the first two values. Does the lowest value come first? Yes, so we don't need to swap them.
- Take one step forward and loo at values 12 and 9. Does the lowest value come first? No. So we need to swap them so that 9 comes first. -> [7, 9, 12, 11, 3]
- Taking one step forwardd, looking at 12 and 11. We must swap so that 11 comes before 12. -> [7, 9, 11, 12, 3]
- Now 12 and 3 -> [7, 9, 11, 12, 3]

We must understand what happened in this, so that we can perform the complete bubble sorting in our programs.
Can you see what happened to the highest value 12? It has bubbled up to the end of the array, where it belongs. But the rest of the array remains unsorted.
So the Bubble Sort algorithm must run through the array again, and again, and again, each time the next highest value bubbles up to its correct position. The sorting continues until the lowest value 3 is left at the start of the array. This means we need to run through the array 4 times, to sort the array of 5 values.


## Selection Sort [Average - O(n²)]

The Selection Sort algorithm finds the lowest value in an array and moves it to the front of the array.

Let the unsorted array is [7, 12, 9, 11, 3]

- Go through the array, one value at a time. Which value is the lowest? Move the lowest value to the front of the array. -> [3, 7, 12, 9, 11]
- Go like this again and again until it become sorted -> [3, 7, 9, 11, 12]

Swapping the first and last is the best solution.

## Insertion Sort [Average - O(n²)]

The Insertion Sort algorithm uses one part of the array to hold the sorted values, and the other part of the array to hold values that are not sorted yet.

Let the unsorted array is [7, 12, 9, 11, 3]

- We can consider the first value as the initial sorted part of the array. If it is just one value, it must be sorted. -> [7, 12, 9, 11, 3]
- The next value 12 should now be moved into the correct position in the sorted part of the array. But 12 is higher than 7, so it is already in the correct position. -> [7, 12, 9, 11, 3]
- Consider teh next value 9. The value 9 must now be moved into the correct position inside the sorted part of the array, so we move 9 in between 7 and 12. -> [7, 9, 12, 11, 3]
- Go like this again and again until it become sorted -> [3, 7, 9, 11, 12]