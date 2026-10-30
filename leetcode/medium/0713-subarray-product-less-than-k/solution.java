class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        if(k<=1) return 0;
        int pro = 1;
        int count = 0;
        int l = 0;
        for(int i=0;i<n;i++){
            pro *= nums[i];
            while(pro>=k){
                pro /= nums[l];
                l++; 
            }
            count += i-l+1;
        }
        return count;
    }
}