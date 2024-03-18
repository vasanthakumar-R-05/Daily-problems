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
    public int maxDepth(TreeNode root) {
        int ans=0;
        if(root==null)
        {
            ans=0;
        }
        else
        {
            int ld=maxDepth(root.left);
            int rd=maxDepth(root.right);
            if(ld>rd)
            {
                ans=ld+1;
            }
            else
            {
                ans=rd+1;
            }
        }
        return ans;
    }
}