// class Solution {
//     public int maxIceCream(int[] costs, int coins) {
//         int sum=0;
//         int count=0;
//         int n=costs.length;
//         Arrays.sort(costs);
//         for(int i=0;i<n;i++){
//             sum+=costs[i];
//             if(sum<=coins){
//                 count++;
//             }else{
//                 sum=sum-costs[i];
//             }
//         }
//         return count;
//     }
// }

//optimized-----------------------

class Solution {
    public int maxIceCream(int[] costs, int coins) {
      int[] freq = new int[100001];
      int count=0;

    for(int cost : costs){
        freq[cost]++;
    }

    for(int price = 1; price < freq.length; price++){
        int take = Math.min(freq[price], coins / price);
        count += take;
        coins -= take * price;
    }
        return count;
    }
}





