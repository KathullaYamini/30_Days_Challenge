class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!s.isEmpty() && s.peek()<nums2[i]){
                h.put(s.peek(),nums2[i]);
                s.pop();
            }
            s.push(nums2[i]);
        }
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){

            res[i]=h.getOrDefault(nums1[i],-1);
        }
        return res;

            
        
        
    }
}