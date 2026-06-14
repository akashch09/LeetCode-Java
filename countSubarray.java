class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int disCount=set.size();

        int left=0;
        int right=0;
        int ans=0;

        HashMap<Integer,Integer> mp = new HashMap<>();
        while(right<n){
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1);
            while(mp.size()==disCount){
                ans+=(n-right);
                mp.put(nums[left], mp.get(nums[left]) - 1);
                if (mp.get(nums[left]) == 0) {
                mp.remove(nums[left]);
                }
                left++;
            }
            right++;
        }
        return ans;
    }
}