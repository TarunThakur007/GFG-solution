class Solution {
    public int divide(int dividend, int divisor) {
        int count = 0;
        while(dividend>=divisor && dividend>0){
            if(divisor<0){
                dividend+=divisor;
                count++;
            }else{ 
                dividend-=divisor;
                count++;
            }
        }
        if(divisor<0) count=-(count-1);
        return count;
    }
}