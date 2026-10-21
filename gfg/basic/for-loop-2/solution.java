class Solution {
    public static void utility(String s) {
        // code here
        int j=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                System.out.print(s.charAt(i));
            }
        }
    }
}