class Solution {
    public int maxSubArray(int[] nums) {
        int s=nums[0];
        int m=nums[0];
        for(int i=1;i<nums.length;i++){
            m=Math.max(m+nums[i],nums[i]);
            s=Math.max(s,m);
        }
        return s;
    }
}