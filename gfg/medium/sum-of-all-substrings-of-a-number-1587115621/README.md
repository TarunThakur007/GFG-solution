# Sum of all substrings of a number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer  **s**  represented as a string, the task is to get the sum of all possible sub-strings of this string.

 **Note:**  The number may have leading zeros.
It is guaranteed that the total sum will fit within a 32-bit signed integer.

 **Examples:** 

```
Input: s = "6759"
Output: 8421
Explanation:
Sum = 6 + 7 + 5 + 9 + 67 + 75 + 59 + 675 + 759 + 6759 = 8421

```

```
Input: s = "421"
Output: 491
Explanation: 
Sum = 4 + 2 + 1 + 42 + 21 + 421 = 491
```

 **Constraints:** 
1 <= |s| <= 9

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T14:05:43.015Z  

```java
class Solution {
    public static int sumSubstrings(String s) {
        // code here
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int temp=0;
            for(int j=i;j<s.length();j++){
                temp = temp * 10 + (s.charAt(j) - '0');
                sum += temp;
            }
        }
        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-all-substrings-of-a-number-1587115621/1)