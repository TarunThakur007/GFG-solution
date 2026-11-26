class Solution {
    public boolean canAliceWin(int n) {

        if(n<10) {
            return false;
        }
        else{
            int a = n-10;
            if(a>=9){
                return false;
            }else{
                return true;
            }
        }
    }
}