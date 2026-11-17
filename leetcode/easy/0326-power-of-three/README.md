# Power of Three

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `n`, return  *`true` if it is a power of three. Otherwise, return `false`*.

An integer `n` is a power of three, if there exists an integer `x` such that `n == 3x`.

 

Original
Java
 **Example 1:** 

```
Input: n = 27
Output: true
Explanation: 27 = 33

```

 **Example 2:** 

```
Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.

```

 **Example 3:** 

```
Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).

```

 

 **Constraints:** 

- -231 <= n <= 231 - 1

 

 **Follow up:**  Could you solve it without loops/recursion?

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 40.6 MB  
**Submitted:** 2026-11-17T07:13:52.226Z  

```java
class Solution {
    public boolean isPowerOfThree(int n) {
        int x=0;
        if(n<=0) return false;
        while(n>1){
            n = n/3;
        }
        if(n==1) return true;
        else return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/power-of-three/)