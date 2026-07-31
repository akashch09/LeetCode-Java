class Solution {

    private boolean isSorted(List<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        int operations = 0;

        while (!isSorted(list)) {
            int idx = 0;
            int minSum = list.get(0) + list.get(1);

            // Find the leftmost adjacent pair with minimum sum
            for (int i = 1; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            // Merge the pair
            list.set(idx, minSum);
            list.remove(idx + 1);

            operations++;
        }

        return operations;
    }
}