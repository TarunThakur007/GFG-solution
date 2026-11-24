# Maximum Subarray With Equal Products

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of  **positive**  integers `nums`.

An array `arr` is called  **product equivalent**  if `prod(arr) == lcm(arr) * gcd(arr)`, where:

- prod(arr) is the product of all elements of arr.
- gcd(arr) is the GCD of all elements of arr.
- lcm(arr) is the LCM of all elements of arr.

Return the length of the  **longest**   **product equivalent**  subarray of `nums`.

 

Original
Java
 **Example 1:** 

 **Input:**  nums = [1,2,1,2,1,1,1]

 **Output:**  5

 **Explanation:**  

The longest product equivalent subarray is `[1, 2, 1, 1, 1]`, where `prod([1, 2, 1, 1, 1]) = 2`, `gcd([1, 2, 1, 1, 1]) = 1`, and `lcm([1, 2, 1, 1, 1]) = 2`.

 **Example 2:** 

 **Input:**  nums = [2,3,4,5,6]

 **Output:**  3

 **Explanation:**  

The longest product equivalent subarray is `[3, 4, 5].`

 **Example 3:** 

 **Input:**  nums = [1,2,3,1,4,5,1]

 **Output:**  5

 

 **Constraints:** 

- 2 <= nums.length <= 100
- 1 <= nums[i] <= 10

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 96.84%)  
**Memory:** 43.7 MB (beats 85.26%)  
**Submitted:** 2026-11-24T12:08:56.867Z  

```java
class Solution {
    public int maxLength(int[] nums) {
        int maxElement = 0;
        int overallLcm = 1;
        for (int num : nums) {
            maxElement = Math.max(maxElement, num);
            overallLcm = lcm(overallLcm, num);
        }
        
        int maxProduct = overallLcm * maxElement;
        int n = nums.length;
        int maxLength = 0;
        
        for (int i = 0; i < n; ++i) {
            int product = 1;
            int currentGcd = 0;
            int currentLcm = 1;
            
            for (int j = i; j < n; ++j) {
                product *= nums[j];
                currentGcd = gcd(currentGcd, nums[j]);
                currentLcm = lcm(currentLcm, nums[j]);
                
                if (product == currentGcd * currentLcm) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
                
                if (product > maxProduct) {
                    break;
                }
            }
        }
        return maxLength;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}   
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-subarray-with-equal-products/)