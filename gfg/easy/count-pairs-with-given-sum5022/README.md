# Pairs with 0 Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array  **arr**, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.

Note: The pairs must be returned in sorted order, the solution array should also be sorted, and the answer must not contain any duplicate pairs.

 **Examples:** 

```
Input: arr = [-1, 0, 1, 2, -1, -4]
Output: [[-1, 1]]
Explanation: arr[0] + arr[2] = (-1)+ 1 = 0.
arr[2] + arr[4] = 1 + (-1) = 0.
The distinct pair are [-1,1].

```

```
Input: arr = [6, 1, 8, 0, 4, -9, -1, -10, -6, -5]
Output: [[-6, 6],[-1, 1]]
Explanation: The distinct pairs are [-1, 1] and [-6, 6].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T13:49:03.494Z  

```java
class Solution {
	public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
		// code here
		Arrays.sort(arr);
          ArrayList<ArrayList<Integer>> li = new ArrayList<>();
          int i = 0, j = arr.length - 1;
          while (i < j) {
              int sum = arr[i] + arr[j];
              if (sum == 0) {
                  ArrayList<Integer> pair = new ArrayList<>();
                  pair.add(arr[i]);
                  pair.add(arr[j]);
                  li.add(pair);
                  int lastI = arr[i], lastJ = arr[j];
                  while (i < j && arr[i] == lastI) i++;  
                  while (i < j && arr[j] == lastJ) j--;
              } else if (sum < 0) {
                  i++;
              } else {
                  j--;
              }
          }
          return li;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1)