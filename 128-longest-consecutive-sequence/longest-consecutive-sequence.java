class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int longest=0;
        int lastSmall=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastSmall){
                c++;
                lastSmall=nums[i];
            }
            else if(nums[i]!=lastSmall){
                c=1;
                lastSmall=nums[i];


            }
            longest=Math.max(c,longest);

        }
        return longest;
        
    }
}