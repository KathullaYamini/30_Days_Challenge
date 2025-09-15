class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        
        if (brokenLetters.isEmpty()) {
            return words.length;
        }

        String regex = "[" + brokenLetters + "]";

        int count = 0;
        for (String word : words) {
           
            if (word.replaceAll(regex, "").equals(word)) {
                count++;
            }
        }
        return count;
    }
}
