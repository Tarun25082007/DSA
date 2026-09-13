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
    public class Treenode{
        int ht ;
        int di ;
        Treenode(int ht,int di){
            this.ht = ht;
            this.di= di;

        }
    }
    public Treenode diameter(TreeNode root){
        if (root == null){
            return new Treenode(0,0);
        }
        Treenode left = diameter(root.left);
        Treenode right = diameter(root.right);
        int height = Math.max(left.ht , right.ht) +1;
        int dia1 = left.di;
        int dia2 = right.di;
        int dia3 = left.ht+right.ht;
        int maxdiameter = Math.max(Math.max(dia1,dia2),dia3);
         Treenode info = new Treenode(height,maxdiameter);
         return info ;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return (diameter(root).di);
        
    }
}