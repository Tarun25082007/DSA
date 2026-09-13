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
     public  void func (TreeNode root)
    {if (root == null)
    {
    return;}
     x.add(root.val);
    func(root.left);
    func(root.right);
    }
    public List<Integer> x = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        func(root);
        return x;
        
    }
}