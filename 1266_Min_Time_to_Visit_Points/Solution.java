class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;
        for(int i = 0; i < points.length - 1; i++){
            int[] curr = points[i];
            int[] dest = points[i+1];

            totalTime += Math.max(Math.abs(dest[0] - curr[0]), Math.abs(dest[1] - curr[1]));
        }
        return totalTime;
    }
}
