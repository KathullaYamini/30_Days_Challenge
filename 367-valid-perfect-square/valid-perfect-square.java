class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        else{
            int l=2;
            int r=num/2;
            while(l<=r){
                int mid=(l+r)/2;
                long guess=(long)mid*mid;
                if(guess==num){
                    return true;
                }
                else if(guess<num){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return false;
        
    }
}