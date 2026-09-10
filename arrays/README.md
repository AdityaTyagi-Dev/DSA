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

## Bubble Sort [O(n²)]

Bubble sort is an algorithm that sorts an array from the lowest value to the highest value.

Let the unsorted array is [7, 12, 9, 11, 3]

- We look at the first two values. Does the lowest value come first? Yes, so we don't need to swap them.
- Take one step forward and loo at values 12 and 9. Does the lowest value come first? No. So we need to swap them so that 9 comes first. -> [7, 9, 12, 11, 3]
- Taking one step forwardd, looking at 12 and 11. We must swap so that 11 comes before 12. -> [7, 9, 11, 12, 3]
- Now 12 and 3 -> [7, 9, 11, 12, 3]

We must understand what happened in this, so that we can perform the complete bubble sorting in our programs.
Can you see what happened to the highest value 12? It has bubbled up to the end of the array, where it belongs. But the rest of the array remains unsorted.
So the Bubble Sort algorithm must run through the array again, and again, and again, each time the next highest value bubbles up to its correct position. The sorting continues until the lowest value 3 is left at the start of the array. This means we need to run through the array 4 times, to sort the array of 5 values.
