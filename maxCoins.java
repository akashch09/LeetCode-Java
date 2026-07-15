class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length-2;
        int i=piles.length/3;
        int sum=0;
        while(n>=i){
            int ans=piles[n];
            sum=sum+ans;
            n=n-2;
        }
        return sum;
    }
}