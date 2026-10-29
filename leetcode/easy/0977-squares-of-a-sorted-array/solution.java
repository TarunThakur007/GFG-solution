class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        for(int i=0;i<nums.length;i++){
            int a = nums[i]*nums[i];
            nums[i] = a;
        }
        Arrays.sort(nums);
        return nums;
    }
}