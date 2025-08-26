class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        List<StringBuilder> l=new ArrayList<>();
        for(int i=0;i<Math.min(numRows,s.length());i++){
            l.add(new StringBuilder());
        }
        int cr=0;
        boolean down=false;
        for(char c:s.toCharArray()){
            l.get(cr).append(c);
            if(cr==0 || cr==numRows-1){
                down=!down;
            }
            cr+=down?1:-1;
        }
        StringBuilder r=new StringBuilder();
        for(StringBuilder row:l){
            r.append(row);
        }
        return r.toString();
        
    }
}