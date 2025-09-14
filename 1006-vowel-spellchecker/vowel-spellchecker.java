class Solution {
    public String devowel(String q){
        return q.toLowerCase().replaceAll("[aeiou]","*");
    }
    public String[] spellchecker(String[] wordlist, String[] queries) {
        String[] ans=new String[queries.length];
        HashSet<String> h=new HashSet<>();
        HashMap<String,String> cas=new HashMap<>();
        HashMap<String,String> vowel=new HashMap<>();
        for(String word:wordlist){
            h.add(word);
            cas.putIfAbsent(word.toLowerCase(),word);
            vowel.putIfAbsent(devowel(word),word);
        }
        for(int i=0;i<queries.length;i++){
            String q=queries[i];
            String low=q.toLowerCase();
            if(h.contains(q)){
                ans[i]=q;
               
            }
            else if(cas.containsKey(low)){
                ans[i]=cas.get(low);
             
            }
            else if(vowel.containsKey(devowel(q))){
                ans[i]=vowel.get(devowel(q));
             
            }
            else{
                ans[i]="";
            }

        }
        return ans;
    }
}