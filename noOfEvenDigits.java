public class noOfEvenDigits {
   
    public int findNumbers(int[] nums) {
        int count=0;
        int n=nums.length;
        if(n==0){
            return 0;
        }

        for(int i=0;i<n;i++){
            int digits=0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                digits++;
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
}

