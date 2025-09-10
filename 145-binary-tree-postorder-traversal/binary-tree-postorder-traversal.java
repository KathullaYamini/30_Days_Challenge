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
    public void postorder(TreeNode root, List<Integer> io){
        if(root==null) return;
        postorder(root.left,io);
        postorder(root.right,io);
        io.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> io=new ArrayList<>();
        postorder(root,io);
        return io;
    }
}