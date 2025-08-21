class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hm=new HashSet<>();
        boolean flag=false;
        for(int i=0;i<nums.length;i++)
        {
            if(hm.contains(nums[i])){
                flag=true;
                break;
            }
            else{
                hm.add(nums[i]);
            }
        }
        return flag;
        
    }
}