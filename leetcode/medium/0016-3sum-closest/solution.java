class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int ans =0;
        for(int i=0;i<n;i++){
            int r = n-1;
            int l = i+1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                while(l<r && nums[l]==nums[l+1]) l++;
                while(l<r && nums[r]==nums[r-1]) r--;
                int mini = Integer.MAX_VALUE;
                mini = Math.min(mini,sum-target);
                ans = Math.abs(target-mini);
                l++;
                r--;
            }
        }
        return ans;
    }
}