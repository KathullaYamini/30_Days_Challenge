class Solution {
    public void subSet(int[] a,int i,List<List<Integer>> res,List<Integer> curr){
            res.add(new ArrayList<>(curr));
           for(int j=i;j<a.length;j++){
        if(j>i && a[j]==a[j-1]) continue;
        curr.add(a[j]);
        subSet(a,j+1,res,curr);
        curr.remove(curr.size()-1);
           }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        subSet(nums,0,res,curr);
        return res;
    }
}