class Solution {
    public List<Integer> toList(int[] a){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            list.add(a[i]);
        }
        return list;

    }
    public void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void reverse(int[] a ,int s,int e){
        while(s<e){
            swap(a,s,e);
            s++;
            e--;
        }
    }
    public boolean nextPermutation(int[] a){
        int ind=-1;
        for(int i=a.length-2;i>=0;i--){
            if(a[i+1]>a[i]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            return false;
        }
        for(int i=a.length-1;i>ind;i--){
            if(a[i]>a[ind]){
                swap(a,i,ind);
                break;
            }
        }
        reverse(a,ind+1,a.length-1);
        return true;
        
            }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        res.add(toList(nums));
        while(nextPermutation(nums)){
            res.add(toList(nums));
        }
        return res;
    }
}