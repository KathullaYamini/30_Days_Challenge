class Solution {
    public int reverse(int x) {
        int val=0;
        while(x!=0){
        int rem=x%10;
        x=x/10;
        if(val>Integer.MAX_VALUE/10 || val<Integer.MIN_VALUE/10){
        return 0;
        }
        val=val*10+rem;
        
        }
        return val;
        
    }
}