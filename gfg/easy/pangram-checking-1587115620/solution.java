class Solution {
    public static boolean checkPangram(String s) {
        // code here
        for(char ch='a';ch<='z';ch++){
            boolean flag = false;
            for(int i=0;i<s.length();i++){
                if(ch == Character.toLowerCase(s.charAt(i))){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return false;
            }
        }
        return true;
    }
}