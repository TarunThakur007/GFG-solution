// class Solution {
// 	public String reverseWords(String s) {
// 		// Code here
// 		String[] parts = s.split("\\.",-1);
// 		StringBuilder st = new StringBuilder();
// 		for (int i = parts.length - 1; i >= 0; i--) {
// 			if (i == 0) {
// 				st.append(parts[i]);
// 			} else {
// 				st.append(parts[i]+'.');
// 			}
// 		}
// 		return st.toString();
// 	}
// }
class Solution {
    public String reverseWords(String s) {
        String[] parts = s.split("\\.");

        StringBuilder st = new StringBuilder();

        for (int i = parts.length - 1; i >= 0; i--) {
            if (!parts[i].isEmpty()) {
                if (st.length() > 0) {
                    st.append('.');
                }
                st.append(parts[i]);
            }
        }

        return st.toString();
    }
}