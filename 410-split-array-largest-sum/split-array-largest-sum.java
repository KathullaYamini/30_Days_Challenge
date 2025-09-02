class Solution {
     public int max(int[] a){
        int m=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>m){
                m=a[i];
            }
        }
        return m;
    }
    public int sum(int[] a){
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        return s;
    }
    public boolean canSplit(int[] a,int k,int sum){
        int count=1;
        int currSum=0;
        for(int i=0;i<a.length;i++){
            if(currSum+a[i]>sum){
                count++;
                currSum=0;
            }
            currSum+=a[i];
            if(count>k){
                return false;
            }
        }
        return true;
                }
  
    public int splitArray(int[] nums, int k) {
        int low=max(nums);
        int high=sum(nums);
        while(low<=high){
         int mid=(low+high)/2;
        if(canSplit(nums,k,mid)==true){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        return low;
    }
}