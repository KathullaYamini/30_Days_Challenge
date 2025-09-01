class Solution {
    public static void combination(int i,int[] a,int sum,List<List<Integer>> res,List<Integer> curr){
        if(i==a.length){
            if(sum==0){
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        if(a[i]<=sum){
            curr.add(a[i]);
            combination(i,a,sum-a[i],res,curr);
            curr.remove(curr.size()-1);

        }
        combination(i+1,a,sum,res,curr);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> h=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        combination(0,candidates,target,h,curr);
        return h;
    }
}