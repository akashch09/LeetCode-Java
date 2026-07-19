class Solution {
    public int maxProfit(int[] prices) {
        // int maxi=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //        int sum= prices[j]-prices[i];
        //        maxi=Math.max(maxi,sum);
        //     }
        // }
        // return maxi;

        int cheap=prices[0];
        int maxi=0;
        for(int i=0;i<prices.length;i++){
            if(cheap<prices[i]){
                int profit=prices[i]-cheap;
                maxi=Math.max(maxi,profit);
            }else{
                cheap=prices[i];
            }
        }
        return maxi;
    }
}