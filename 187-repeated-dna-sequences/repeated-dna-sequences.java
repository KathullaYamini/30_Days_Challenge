class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> se=new HashSet<>();
        HashSet<String> r=new HashSet<>();
        for(int i=0;i+10<=s.length();i++){
            String sub=s.substring(i,i+10);
            if(!se.add(sub)){
                r.add(sub);
            }
        }
        return new ArrayList<>(r);
    }
}