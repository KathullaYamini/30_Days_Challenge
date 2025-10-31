class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0;
        int r=0;
        HashSet<Integer> h=new HashSet<>();
        while(r<=nums.length-1){
            if(h.contains(nums[r])){
                return true;
            }
            h.add(nums[r]);
            if((r-l)>k-1){
                h.remove(nums[l]);
                l++;
            }
            r++;
            }
         
        return false;
    }
}