# Segregate 0s and 1s

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  consisting of only  **0** 's and  **1** 's. Modify the array  **in-place**  to segregate 0s onto the left side and 1s onto the right side of the array.

 **Examples :** 

```
Input: arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 0, 0, 1, 1, 1, 1, 1].
```

```
Input: arr[] = [1, 1]
Output: [1, 1]
Explanation: There are no 0s in the given array, so the modified array is [1, 1]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T04:44:02.560Z  

```java
class Solution {
    void segregate0and1(int[] arr) {
        // code here
        // int l = 0;
        // int n = arr.length;
        // int r = n-1;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0){
        //         int x = arr[i];
        //         arr[i] = arr[l];
        //         arr[l] = x;
        //         l++;
        //     }else{
        //         int x = arr[i];
        //         arr[i] = arr[r];
        //         arr[r] = x;
        //         r--;
        //     }
        // }
        Arrays.sort(arr);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1)