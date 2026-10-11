# Trapping Rain Water

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

 

 **Example 1:** 

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

```

 **Example 2:** 

```
Input: height = [4,2,0,3,2,5]
Output: 9

```

 

 **Constraints:** 

- n == height.length
- 1 <= n <= 2 * 104
- 0 <= height[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 47.8 MB (beats 51.53%)  
**Submitted:** 2026-10-11T11:30:17.113Z  

```java
class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int area=0;
        while(l<r){
            if(height[l]<height[r]){
                if (height[l] >= leftMax) {
                    leftMax = height[l];
                } else {
                    area += leftMax - height[l];
                }
                l++;
            }else{
                if (height[r] >= rightMax) {
                    rightMax = height[r];
                } else {
                    area += rightMax - height[r];
                }
                r--;
            }
           // maxWater = Math.max(maxWater,area);
        }
        return area;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/trapping-rain-water/)