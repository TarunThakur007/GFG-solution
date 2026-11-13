# Summary Ranges

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a  **sorted unique**  integer array `nums`.

A  **range**  `[a,b]` is the set of all integers from `a` to `b` (inclusive).

Return  *the  **smallest sorted**  list of ranges that  **cover all the numbers in the array exactly***. That is, each element of `nums` is covered by exactly one of the ranges, and there is no integer `x` such that `x` is in one of the ranges but not in `nums`.

Each range `[a,b]` in the list should be output as:

- "a->b" if a != b
- "a" if a == b

 

Original
Java
 **Example 1:** 

```
Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"

```

 **Example 2:** 

```
Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"

```

 

 **Constraints:** 

- 0 <= nums.length <= 20
- -231 <= nums[i] <= 231 - 1
- All the values of nums are unique.
- nums is sorted in ascending order.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 83.01%)  
**Memory:** 42.4 MB (beats 94.59%)  
**Submitted:** 2026-11-13T15:32:04.565Z  

```java
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int start = nums[i];
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            int end = nums[i];
            if (start == end)
                ans.add("" + start);
            else
                ans.add("" + start + "->" + end);
        }
        return ans;
    }
}   
```

---

[View on LeetCode](https://leetcode.com/problems/summary-ranges/)