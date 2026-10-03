# Check for Subsequence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **s1**  and  **s2**. You have to check that  **s1**  is a subsequence of  **s2**  or not.
 **Note:**  A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.

 **Examples:** 

```
Input: s1 = "AXY", s2 = "YADXCP"
Output: false
Explanation: s1 is not a subsequence of s2 as 'Y' appears before 'A'.
```

```
Input: s1 = "gksrek", s2 = "geeksforgeeks"
Output: true
Explanation: If we combine the bold character of "geeksforgeeks", it equals to s1. So s1 is a subsequence of s2. 
```

 **Constraints:** 
1 ≤ s1.size(), s2.size() ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T05:16:52.037Z  

```java
class Solution {
	public boolean isSubSeq(String s1, String s2) {
		int i = 0;
		for (int j = 0; i < s1.length() && j < s2.length(); j++) {
			if (s1.charAt(i) == s2.charAt(j))
				i++;
		}
		return i == s1.length();
	}
};

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/given-two-strings-find-if-first-string-is-a-subsequence-of-second/1)