class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0;
        int cmax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cmax++;
            }
            else{
                cmax=0;
            }
            m=Math.max(cmax,m);
        }
        return m;
    }
}