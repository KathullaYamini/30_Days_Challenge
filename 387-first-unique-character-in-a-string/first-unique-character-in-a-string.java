class Solution {
    public int firstUniqChar(String s) {
        int[] nums=new int[26];
        int c=-1;
        for(int i=0;i<s.length();i++){
            nums[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<s.length();i++){
            if(nums[s.charAt(i)-'a']==1){
                c=i;
                break;
            }
        }
        return c;
        
    }
}