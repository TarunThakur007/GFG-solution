class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        final int inf = Integer.MAX_VALUE;
        int ans = inf;
        
        // Iterate through all possible starting positions
        for (int i = 0; i < n; ++i) {
            int s = 0;
            // Extend the subarray from the starting position
            for (int j = i; j < n; ++j) {
                s += nums.get(j);
                int k = j - i + 1; // Current subarray length
                
                // Check if length is within [l, r] and sum is positive
                if (k >= l && k <= r && s > 0) {
                    ans = Math.min(ans, s);
                }
            }
        }
        
        // Return -1 if no valid subarray was found
        return ans == inf ? -1 : ans;
    }
}   