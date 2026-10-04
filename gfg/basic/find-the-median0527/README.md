# Median of an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**  of integers, calculate the median.

 **Examples:** 

```
Input: arr[] = [90, 100, 78, 89, 67]
Output: 89
Explanation: After sorting the array middle element is the median 

```

```
Input: arr[] = [56, 67, 30, 79]
Output: 61.5
Explanation: In case of even number of elements, average of two middle elements is the median. 

```

```
Input: arr[] = [1, 2]
Output: 1.5
Explanation: The average of both elements will result in 1.5.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T05:33:07.297Z  

```java
class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        int n = arr.length;
        double sum=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(n%2!=0) sum = arr[(n/2)];
            else{
                sum = (arr[n/2]+arr[(n/2)-1])/2.0;
            }
        }
        return sum;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-median0527/1)