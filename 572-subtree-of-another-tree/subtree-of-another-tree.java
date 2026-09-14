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
    // compare
    public boolean isidentical(TreeNode root, TreeNode subRoot){
        if (root == null && subRoot == null){
            return true;
        }
      if (root == null || subRoot == null){
              return false;
      }
      if (root.val == subRoot.val){
      return isidentical(root.left,subRoot.left) && isidentical(root.right,subRoot.right); }
    else {
        return false;
    }
      // both side sld be equal and we are doing this as we already check for value below
    }
    // starting point
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null){
            return true;
        }
        // no subtree so always true
        if (root == null )
        {
            return false;
        }        
        // no root tree so always false excpet whn both null covered in above case
        if(root.val == subRoot.val){
            // from here we compare the whole tree
            if(isidentical(root,subRoot))
{
    return true;
}      
  }
//if once its true its true 
return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
   }
}