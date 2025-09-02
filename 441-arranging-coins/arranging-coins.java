class Solution {
    public int arrangeCoins(int n) {
        long l=1;
        long h=n;
        while(l<=h){
            long mid=(l+(h-l)/2);
            long coin=(long) (mid*(mid+1))/2;
            if(coin==n){
                return (int)mid;
            }
            else if(coin<n){
                l=mid+1;
            }
            else{
                h=mid-1; 
            }
        }
        return (int)h;
    }
}