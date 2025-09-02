class Solution {
    public static void combination(int i,int[] a,int target,List<List<Integer>> res,List<Integer> c){
            if(target==0){
                res.add(new ArrayList<>(c));
                return;
            }
                for(int j=i;j<a.length;j++){
                    if(j>i && a[j-1]==a[j]){
                        continue;
                    }
                    if(target<a[j]){
                        break;
                    }
                    c.add(a[j]);
                    combination(j+1,a,target-a[j],res,c);
                    c.remove(c.size()-1);
                }
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        combination(0,candidates,target,res,c);
        return res;
    }
}