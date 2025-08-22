class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int val=0;
        for(int i=0;i<s.length();i++){
            int curr=h.get(s.charAt(i));
            int next=0;
            if(i+1<s.length()){
                next=h.get(s.charAt(i+1));
                
            }
            if(next<=curr){
                val+=curr;
            }
            else{
                val-=curr;
            }

        }
        return val;
        

    }
}