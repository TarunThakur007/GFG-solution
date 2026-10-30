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
**Runtime:** 17 ms (beats 79.38%)  
**Memory:** 44.6 MB (beats 98.88%)  
**Submitted:** 2026-10-30T07:39:31.079Z  

```java
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // int n = nums.length;
        // int ans = 0;
        // Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     int r = n-1;
        //     int l = i+1;
        //     while(l<r){
        //         int sum = nums[i]+nums[l]+nums[r];
        //         if(nums[i]==0 && nums[r]==0 && nums[r-1]==0 && nums[l+1]==0) return 0;
        //         while(l<r && nums[l]==nums[l+1]) l++;
        //         while(l<r && nums[r]==nums[r-1]) r--;
        //         if(sum-target<target) l++;
        //         else if(sum-target>target) r--;
        //         else return sum;
        //         int mini = Integer.MAX_VALUE;
        //         mini = Math.min(mini,sum-target);
        //         ans = Math.abs(target-mini);
        //     }
        // }
        // return ans;
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target)
                    return sum;
                if (Math.abs(sum - target) < Math.abs(ans - target))
                    ans = sum;
                if (sum < target)
                    l++;
                else
                    r--;
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/3sum-closest/)