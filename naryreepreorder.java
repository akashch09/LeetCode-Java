class naryreepreorder {

    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    private void helper(Node node, List<Integer> ans) {
        if (node == null) {
            return;
        }

        ans.add(node.val);

        for (Node child : node.children) {
            helper(child, ans);
        }
    }
}