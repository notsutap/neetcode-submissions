/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> smallList;
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return new ArrayList<>();
        TreeNode curr = root;
        q.add(curr);
        while(!q.isEmpty()) {
            smallList = new ArrayList<>();
            int qLen = q.size();
            for(int i = 0; i < qLen; i++) {
                curr = q.poll();
                smallList.add(curr.val);

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            res.add(smallList);
        }
        return res;
    }
}
