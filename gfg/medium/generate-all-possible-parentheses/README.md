# Generate Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a number  **n**, return all the combinations of balanced parentheses of length n.
 **Note:**  A sequence of parentheses is  **balanced**  if every opening bracket has a corresponding closing bracket in the  **correct order**.
For example, "(())", "()()", and "(()())" are balanced, whereas ")()(", "))((", and "()))" are not.

 **Examples:** 

```
Input: n = 6
Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]
Explanation: These are the only possible valid balanced parentheses.
```

```
Input: n = 4
Output: ["(())", "()()"]
Explanation: These are the only possible valid balanced parentheses.
```

 **Constraints:** 
1 ≤ n ≤ 16
n % 2 == 0

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T13:22:27.537Z  

```java
class Solution {
	ArrayList<String> ans;
	public void solve(int n, int open, int close, String temp) {
		if (open == n && close == n) {
			ans.add(temp);
			return;
		}
		if(open<n){
		    solve(n,open+1,close,temp+'(');
		}
		if(close<open){
		    solve(n,open,close+1,temp+')');
		}
		
	}
	public ArrayList<String> generateParentheses(int n) {
		// code here
		ans = new ArrayList<String>();
		solve(n/2,0,0,"");
		return ans;
	}
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/generate-all-possible-parentheses/1)