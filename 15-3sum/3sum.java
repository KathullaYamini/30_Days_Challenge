class Solution {
    //better-O(n^2)
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> h=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(h.contains(third)){
                   List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    hs.add(temp);
                }

                h.add(nums[j]);
            }
        }
        return new ArrayList<>(hs);
        
    }
}