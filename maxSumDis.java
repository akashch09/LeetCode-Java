class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();

        long sum = 0;
        long maxSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Remove duplicates
            while (s.contains(nums[right])) {
                s.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            s.add(nums[right]);
            sum += nums[right];

            // Keep window size <= k
            while (right - left + 1 > k) {
                s.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // Window size exactly k
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}