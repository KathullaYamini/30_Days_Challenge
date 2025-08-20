class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int r=0;
        int l=0;
        int ans=0;
        while(r<s.length()){
            while(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;
            }
            ans=Math.max(ans,r-l+1);
            hs.add(s.charAt(r));
            r++;
        }
        return ans;
        
    }
}