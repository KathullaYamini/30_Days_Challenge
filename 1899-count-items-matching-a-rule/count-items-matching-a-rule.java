class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        for(int i=0;i<items.size();i++){
            String currVal;
            if(ruleKey.equals("type")){
                currVal=items.get(i).get(0);
            }
            else if(ruleKey.equals("color")){
                 currVal=items.get(i).get(1);
            }
            else{
                 currVal=items.get(i).get(2);
            }
        if(currVal.equals(ruleValue)){
                    c++;
                }
        }
        return c;
    }
}