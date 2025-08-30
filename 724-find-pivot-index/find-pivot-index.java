class Solution {
    public int pivotIndex(int[] nums) {
        int lsum=0;
        int rsum=0;
        int s=0;
        int pivot=-1;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rsum=s-lsum-nums[i];
            if(lsum==rsum){
                pivot=i;
                break;

            }
            lsum+=nums[i];
        }
        return pivot;
        
    }
}