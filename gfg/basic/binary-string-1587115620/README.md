# Binary Substrings with Corners as 1

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a binary string  **s**, count the number of substrings that start and end with 1.

 **Examples:** 

```
Input: s = "1111"
Output: 6
Explanation: There are 6 substrings from the given string. They are "11", "11", "11", "111", "111", "1111".
```

```
Input: s = "01101"
Output: 3
Explanation: There are 3 substrings from the given string. They are "11", "101", "1101".
```

 **Constraints:** 
1 ≤ |s| ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T04:42:32.711Z  

```java
class Solution {
    public int binarySubstring(String s) {
        // code here
        int k = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') k++;
            }
            return k * (k - 1) / 2;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/binary-string-1587115620/1)