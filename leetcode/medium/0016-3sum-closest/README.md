# 3Sum Closest

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` of length `n` and an integer `target`.

Find three integers at  **distinct indices**  in `nums` such that the sum is  **closest**  to `target`.

Return the sum of the three integers.

You may assume that each input would have  **exactly**  one solution.

 

 **Example 1:** 

```
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

```

 **Example 2:** 

```
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

```

 

 **Constraints:** 

- 3 <= nums.length <= 500
- -1000 <= nums[i] <= 1000
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.6 MB  
**Submitted:** 2026-10-29T14:08:40.894Z  

```java
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int ans =0;
        for(int i=0;i<n;i++){
            int r = n-1;
            int l = i+1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                while(l<r && nums[l]==nums[l+1]) l++;
                while(l<r && nums[r]==nums[r-1]) r--;
                int mini = Integer.MAX_VALUE;
                mini = Math.min(mini,sum-target);
                ans = Math.abs(target-mini);
                l++;
                r--;
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/3sum-closest/)