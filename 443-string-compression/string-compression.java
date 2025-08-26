class Solution {
    public int compress(char[] chars) {
        int p1=0;
        int p2=0;
        while(p2<chars.length){
            char ch=chars[p2];
            int c=0;
            while(p2<chars.length && chars[p2]==ch){
                p2++;
                c++;
            }
            chars[p1++]=ch;
            if(c>1){
                for(char d:String.valueOf(c).toCharArray()){
                    chars[p1++]=d;
                }
            }
        }
        return p1;
    }
}