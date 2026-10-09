class Solution {
    public static String reverseString(String s) {
        // code here
        int n = s.length();
        if(n==1) return s;
        int i=0;
        int j=n-1;
        char[] chars = s.toCharArray();
        while(i<j){
            char temp = chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}