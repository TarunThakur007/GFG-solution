class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // int n = nums.length;
        // int ans = 0;
        // Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     int r = n-1;
        //     int l = i+1;
        //     while(l<r){
        //         int sum = nums[i]+nums[l]+nums[r];
        //         if(nums[i]==0 && nums[r]==0 && nums[r-1]==0 && nums[l+1]==0) return 0;
        //         while(l<r && nums[l]==nums[l+1]) l++;
        //         while(l<r && nums[r]==nums[r-1]) r--;
        //         if(sum-target<target) l++;
        //         else if(sum-target>target) r--;
        //         else return sum;
        //         int mini = Integer.MAX_VALUE;
        //         mini = Math.min(mini,sum-target);
        //         ans = Math.abs(target-mini);
        //     }
        // }
        // return ans;
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target)
                    return sum;
                if (Math.abs(sum - target) < Math.abs(ans - target))
                    ans = sum;
                if (sum < target)
                    l++;
                else
                    r--;
            }
        }
        return ans;
    }
}