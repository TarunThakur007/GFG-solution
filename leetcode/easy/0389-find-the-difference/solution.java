// class Solution {
//     public char findTheDifference(String s, String t) {
//         Map<Character, Integer> m = new HashMap<>();
//         for (char c : s.toCharArray())
//             m.put(c, m.getOrDefault(c, 0) + 1);
//         for (char c : t.toCharArray()) {
//             m.put(c, m.getOrDefault(c, 0) - 1);
//             if (m.get(c) == -1) return c;
//         }
//         return ' ';
//     }
// }   

class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for (char c : s.toCharArray()) res ^= c;
        for (char c : t.toCharArray()) res ^= c;
        return res;
    }
}   