class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        int n = arr.length;
        double sum=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(n%2!=0) sum = arr[(n/2)];
            else{
                sum = (arr[n/2]+arr[(n/2)-1])/2.0;
            }
        }
        return sum;
    }
}
