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