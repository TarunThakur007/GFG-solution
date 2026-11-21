# Largest Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a list of non-negative integers `nums`, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 

Original
Java
 **Example 1:** 

```
Input: nums = [10,2]
Output: "210"

```

 **Example 2:** 

```
Input: nums = [3,30,34,5,9]
Output: "9534330"

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 0 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 1 ms  
**Memory:** 41.9 MB  
**Submitted:** 2026-11-21T11:07:53.950Z  

```java
class Solution {
    public String largestNumber(int[] nums) {
        // String[] asStrs = new String[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     asStrs[i] = String.valueOf(nums[i]);
        // }
        // Arrays.sort(asStrs, (a, b) -> (b + a).compareTo(a + b));
        // if (asStrs[0].equals("0")) {
        //     return "0";
        // }
        // StringBuilder largestNumberStr = new StringBuilder();
        // for (String numAsStr : asStrs) {
        //     largestNumberStr.append(numAsStr);
        // }
        // return largestNumberStr.toString();

        
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0")) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }
        return result.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/largest-number/)