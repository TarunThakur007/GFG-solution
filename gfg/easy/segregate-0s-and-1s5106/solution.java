class Solution {
    void segregate0and1(int[] arr) {
        // code here
        // int l = 0;
        // int n = arr.length;
        // int r = n-1;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0){
        //         int x = arr[i];
        //         arr[i] = arr[l];
        //         arr[l] = x;
        //         l++;
        //     }else{
        //         int x = arr[i];
        //         arr[i] = arr[r];
        //         arr[r] = x;
        //         r--;
        //     }
        // }
        Arrays.sort(arr);
    }
}
