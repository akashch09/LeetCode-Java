class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int sum=0;
        int count=0;
        int n=costs.length;
        Arrays.sort(costs);
        for(int i=0;i<n;i++){
            sum+=costs[i];
            if(sum<=coins){
                count++;
            }else{
                sum=sum-costs[i];
            }
        }
        return count;
    }
}