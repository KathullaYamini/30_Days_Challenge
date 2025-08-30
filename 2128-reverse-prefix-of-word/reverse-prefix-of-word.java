class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)==-1) return word;
        Stack<Character> s=new Stack<>();
        int start=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                s.push(word.charAt(i));
                start=i;
                break;
            }
            s.push(word.charAt(i));
            
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        for(int i=start+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
        
    }
}