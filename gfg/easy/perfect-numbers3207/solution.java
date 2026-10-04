class Solution {
    static boolean isPerfect(int n) {
        // code here
        if (n <= 1) return false;
        int sum=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                int sf = n/i;
                int ff=i;
                sum = sum+ff+sf;
            }
        }
        if(sum==n) return true;
        else return false;
    }
};