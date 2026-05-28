class solution {
    public int lastStoneWeight(int[] stones) {
        // int n= stones.length;
        // int x=0;
        // while(n>0){
        // Arrays.sort(stones);
        // if(n>1){
        // x=stones[n-1]-stones[n-2];
        // stones[n-2]=x;
        // }else{
        //     return stones[0];
        // }
        // n--;
        // }
        // return x;

        PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());

        for(int ele:stones){
            pq.add(ele);
        }

        while(pq.size()>1){
        int max=pq.remove();
        int smax=pq.remove();

        int nStone=max-smax;

        if(nStone!=0){
            pq.add(nStone);
        }
        }
        if(pq.size()==0){
            return 0;
        }else{
            return pq.remove();
        }
    }
}