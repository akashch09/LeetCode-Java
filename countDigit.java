class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                int rem=nums[i]%10;
                if(rem==digit){
                    count++;
                }
                nums[i]=nums[i]/10;
            }
        }
        return count;
    }
}