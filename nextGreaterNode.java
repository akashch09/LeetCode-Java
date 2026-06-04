
class nextGreaterNode {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int n = list.size();
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int curr = list.get(i);

            while (!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }

            if (!st.isEmpty()) {
                ans[i] = st.peek();
            } else {
                ans[i] = 0;
            }

            st.push(curr);
        }

        return ans;
        
    }
}