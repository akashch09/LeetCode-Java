class Solution {
    public int minimumCost(int[] cost) {
        
        Arrays.sort(cost);
        int sum = 0;
        int i = cost.length-1;

        if(i==0){
            return cost[0];
        }
        if(i==1){
            return cost[0]+cost[1];
        }

        while(i>=0){

            if(i>1){
                sum+= cost[i] + cost[i-1];
            }

            i-=3;
        }

        if(cost.length%3==0){
            return sum;
        }

        i = cost.length%3;

        for(int j=0;j<i;j++)
            sum+=cost[j];

        return sum;

    }
}