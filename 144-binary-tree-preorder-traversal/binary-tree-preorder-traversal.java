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
    public void preorder(TreeNode root, List<Integer> io){
        if(root==null) return;
        io.add(root.val);
        preorder(root.left,io);
        preorder(root.right,io);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> io=new ArrayList<>();
        preorder(root,io);
        return io;
    }
}