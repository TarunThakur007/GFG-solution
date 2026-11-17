class Solution {
    public boolean isPowerOfThree(int n) {
        int x=0;
        if(n<=0) return false;
        while(n>1){
            n = n/3;
        }
        if(n==1) return true;
        else return false;
    }
}