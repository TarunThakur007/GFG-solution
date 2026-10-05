class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(0);
            } else {
                int inner = st.pop();
                st.push(st.pop() + Math.max(2 * inner, 1));
            }
        }
        return st.pop();
    }
}