class Solution {
    public int getWinner(int[] arr, int k) {
        int cur_winner = arr[0];
        int win_streak = 0;
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > cur_winner) {
                cur_winner = arr[i];
                win_streak = 1;
            }
            if(win_streak++ == k) {
                break;
            }
        }
        
        return cur_winner;
        
    }
}
