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
    int mod=1000000007;
    long maxProduct=0;
    long totalSum=0;
    int currSum=0;
    public int maxProduct(TreeNode root) {
      totalSum=sumofTree(root);
      dfs(root);
      return (int)(maxProduct%mod);
        
    }
    public int sumofTree(TreeNode root){
        if(root==null) return 0;
        currSum+=root.val;
        sumofTree(root.left);
        sumofTree(root.right);
        return currSum;
    }

    public long dfs(TreeNode root){
        if(root==null) return 0;
        long l=dfs(root.left);
        long r=dfs(root.right);
        long subSum=l+r+root.val;
        maxProduct=Math.max(maxProduct,subSum*(totalSum-subSum));
        return subSum;
    }
}