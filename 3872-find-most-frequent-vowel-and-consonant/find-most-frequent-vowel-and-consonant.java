class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
         for(int i=0;i<s.length();i++){
          freq[s.charAt(i)-'a']++;
         }
         boolean[] vowel=new boolean[26];
         vowel['a'-'a']=true;
         vowel['e'-'a']=true;
         vowel['i'-'a']=true;
         vowel['o'-'a']=true;
         vowel['u'-'a']=true;
         int maxv=0;
         int maxc=0;
         for(int i=0;i<s.length();i++){
            if(vowel[s.charAt(i)-'a']){
                maxv=Math.max(maxv,freq[s.charAt(i)-'a']);
            }
            else{
                maxc=Math.max(maxc,freq[s.charAt(i)-'a']);
            }
         }
         return maxv+maxc;
         

         
             }
}