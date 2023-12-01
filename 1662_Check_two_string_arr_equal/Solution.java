class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();
        for(int i = 0; i < Math.max(word1.length, word2.length); i++){
            if(i < word1.length) temp1.append(word1[i]);
            if(i < word2.length) temp2.append(word2[i]);
        }
        String first = temp1.toString();
        String second = temp2.toString();

        return first.equals(second);
    }
}
