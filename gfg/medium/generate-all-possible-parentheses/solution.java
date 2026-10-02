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