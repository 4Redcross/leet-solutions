class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans = 0;
        boolean lastM = false, lastG = false, lastP = false;
        int n = garbage.length;
        for(int i = 0; i <= n - 1; i++) {
            if(i < n - 1) ans += travel[i] * 3;
            ans += garbage[i].length();
        }
        for(int i = n - 1; i > 0; i--) {
            if(!lastG) {
                if (garbage[i].contains("G")) lastG = true;
                else ans -= travel[i - 1];
            }
            if(!lastM) {
                if (garbage[i].contains("M")) lastM = true;
                else ans -= travel[i - 1];
            }
            if(!lastP) {
                if (garbage[i].contains("P")) lastP = true;
                else ans -= travel[i - 1];
            }
            if(lastP && lastG && lastM) {
                break;
            }
        }

        return ans;
    }
}
