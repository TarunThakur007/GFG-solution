# Add Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it.

 

Original
Java
 **Example 1:** 

```
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

```

 **Example 2:** 

```
Input: num = 0
Output: 0

```

 

 **Constraints:** 

- 0 <= num <= 231 - 1

 

 **Follow up:**  Could you do it without any loop/recursion in `O(1)` runtime?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 29.62%)  
**Memory:** 42.1 MB (beats 84.15%)  
**Submitted:** 2026-11-17T07:05:41.324Z  

```java
class Solution {
    // public int count(int num){
    //     int ans=0;
    //     int a = 0;
    //     while(num>0){
    //         a = num%10;
    //         num/=10;
    //         ans+=a;
    //     }
    //     return ans;
    // }
    public int addDigits(int num) {
        // if(num<=9) return num;
        // int ans = count(num);
        // int out = 0;
        // while(ans>9){
        //     out = count(ans);
        //     ans = out;
        // }
        // return ans;
        while(num>9){
            int sum = 0;
            while(num>0){
                sum+= num %10;
                num/=10;
            }
            num = sum;
        }
        return num;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-digits/)