class Solution {
    public int sumsq(int n){
        int val=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            val=val+rem*rem;
            n=n/10;
        }
        return val;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=sumsq(slow);
            fast=sumsq(sumsq((fast)));
        }while(slow!=fast);
        return slow==1;
        
    }
}