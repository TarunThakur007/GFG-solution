class Solution {
    // public int count(int num){
    //     int ans=0;
    //     int a = 0;
    //     while(num>0){
    //         a = num%10;
    //         num/=10;
    //         ans+=a;
    //     }
    //     return ans;
    // }
    public int addDigits(int num) {
        // if(num<=9) return num;
        // int ans = count(num);
        // int out = 0;
        // while(ans>9){
        //     out = count(ans);
        //     ans = out;
        // }
        // return ans;
        while(num>9){
            int sum = 0;
            while(num>0){
                sum+= num %10;
                num/=10;
            }
            num = sum;
        }
        return num;
    }
}