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
    
    func(root.left);
    func(root.right);
     x.add(root.val);
    }
    public List<Integer> x = new ArrayList<>();
        
    
    public List<Integer> postorderTraversal(TreeNode root) {
        func(root);
        return x;
        
        
}}