class ThreeDigitEven {
    public int[] findEvenNumbers(int[] digits) {
        TreeSet<Integer> set = new TreeSet<>();
        int num=0;

        for(int i =0;i<digits.length;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<digits.length;j++){
                if(j==i) continue;
                for(int k=0;k<digits.length;k++){
                    if(k==i || k==j) continue;

                    if(digits[k]%2==0){
                        num=digits[i] * 100 + digits[j] * 10 + digits[k];
                        set.add(num);
                    }
                }
            }
        }
       int[] ans = new int[set.size()];
       int idx = 0;

       for(int value : set) {
       ans[idx] = value;
       idx++;
       }

       return ans;
    }
}