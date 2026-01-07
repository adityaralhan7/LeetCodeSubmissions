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
    static long ans;
    static long sum;
    public int maxProduct(TreeNode root) {
        ans=0;
        sum=0;
        totalSum(root);
        dfs(root);
        return (int)(ans%mod);

    }
    public static void totalSum(TreeNode root){
        if(root==null) return;
        sum+=root.val;
        totalSum(root.left);
        totalSum(root.right);
    }
    public static long dfs(TreeNode root){
        if(root==null) return 0;
        long left=dfs(root.left);
        long right=dfs(root.right);

        long subSum=root.val+left+right;
        ans=Math.max(ans,(sum-subSum)*subSum);
        return subSum;
    }
}