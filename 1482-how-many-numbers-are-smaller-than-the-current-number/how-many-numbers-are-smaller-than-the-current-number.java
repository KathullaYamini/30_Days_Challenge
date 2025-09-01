class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
        }
        Arrays.sort(a);
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<a.length;i++){
            
            if(!h.containsKey(a[i])){
                h.put(a[i],i);

            }

        }
        int k=0;
        for(int num:nums){
            a[k]=h.get(num);
            k++;
        }
        return a;
    }
}