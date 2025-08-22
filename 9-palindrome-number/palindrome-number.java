class Solution {
    public int reverse(int x){
        int num=0;
        int rem=0;
        while(x>0){
            rem=x%10;
            num=num*10+rem;
            x=x/10;
        }
        return num;
    }
    public boolean isPalindrome(int x) {
        int y=reverse(x);
        return x==y;
        
    }
}