class Solution {
    public int findMin(int[] arr) {
        int l=0;
        int h=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=h){
            int m=(l+h)/2;
            ans=Math.min(ans,arr[m]);
            if(arr[l]<=arr[m]){
                ans=Math.min(ans,arr[l]);
                l=m+1;
            }
            else{
                ans=Math.min(ans,arr[m+1]);
                h=m-1;
            }
        }
        return ans;
    }
}