class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] allowedCount = new int[26];
        for(char c: chars.toCharArray()){
            allowedCount[(int)(c - 'a')]++;
        }

        int ans = 0;
        for(String word: words){
            int[] tempCount = new int[26];
            boolean flag = true;
            for(char c: word.toCharArray()){
                int pos = (int) c - 'a';
                tempCount[pos]++;
                if(tempCount[pos] > allowedCount[pos]) {
                    flag = false;
                    break;
                }
            }
            if(flag) ans += word.length();
        }
        return ans;
    }
}
