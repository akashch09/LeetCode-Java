class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length, mx = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            a[i] = gcd(nums[i], mx);
        }

        Arrays.sort(a);

        long ans = 0;
        for (int i = 0, j = n - 1; i < j; i++, j--)
            ans += gcd(a[i], a[j]);

        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}