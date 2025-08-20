class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
            res[nums.length+i]=nums[i];
        }
        return res;
    }
}