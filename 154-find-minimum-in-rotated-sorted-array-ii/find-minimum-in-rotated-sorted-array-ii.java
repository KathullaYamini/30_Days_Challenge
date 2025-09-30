class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=h){
            int m=(l+h)/2;
            ans=Math.min(ans,nums[m]);
            if(nums[l]==nums[m] && nums[m]==nums[h]){
                l=l+1;
                h=h-1;
                continue;
            }
            if(nums[l]<=nums[m]){
                ans=Math.min(ans,nums[l]);
                l=m+1;

            }else{
                ans=Math.min(ans,nums[m+1]);
                h=m-1;
            }
        }
        return ans;
        
    }
}