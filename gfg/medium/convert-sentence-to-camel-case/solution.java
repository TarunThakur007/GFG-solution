class Solution {
    public String convertToCamelCase(String s) {
        // code here
        Boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                flag = true;
            }else if(flag == true){
                sb.append(Character.toUpperCase(s.charAt(i)));
                flag = false;
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}