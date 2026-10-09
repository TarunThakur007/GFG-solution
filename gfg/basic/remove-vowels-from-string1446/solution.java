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
