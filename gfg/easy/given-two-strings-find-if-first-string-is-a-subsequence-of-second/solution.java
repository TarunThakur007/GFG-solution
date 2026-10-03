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
