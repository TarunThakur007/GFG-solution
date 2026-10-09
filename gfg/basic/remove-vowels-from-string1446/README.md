# Remove Vowels

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**. Your task is to remove the vowels from the string.

 **Examples:** 

```
Input: s = "welcome to geeksforgeeks"
Output: "wlcm t gksfrgks"
Explanation: Vowels were ignored only consonents were returned in the same order.
```

```
Input: s = "what is your name ?"
Output: wht s yr nm ?

```

 **Constraints:** 
1 <= |s| <= 105
Alphabets are lower cases only

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T13:24:51.099Z  

```java
class Solution {
	String removeVowels(String s) {
		// code here
		int n = s.length();
		StringBuilder st = new StringBuilder(s);
		for (int i = 0; i < st.length(); i++) {
			char c = st.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
			 || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				st.deleteCharAt(i);
				i--;
			}
		}
		return st.toString();
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-vowels-from-string1446/1)