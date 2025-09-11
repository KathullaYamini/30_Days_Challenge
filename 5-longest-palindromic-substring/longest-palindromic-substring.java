class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        int start=0;
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            dp[i][i]=1;
            max=1;
            start=i;
        }
        int n=s.length();
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=1;
                max=2;
                start=i;
            }
        }
        for(int len=3;len<=s.length();len++){
            for(int i=0;i<=n-len;i++){
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1){
                    dp[i][j]=1;
                    max=len;
                    start=i;
                }
            }
        }
        return s.substring(start,max+start);
    }
}