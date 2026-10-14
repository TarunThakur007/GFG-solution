class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        long sum=0;
        long actualSum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        actualSum = (long)(n + 1) * (n + 2) / 2;
        return (int) (actualSum-sum);
    }
}