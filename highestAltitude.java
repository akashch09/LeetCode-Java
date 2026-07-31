class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int max = 0;

        for (int x : gain) {
            current += x;
            max = Math.max(max, current);
        }

        return max;
    }
}