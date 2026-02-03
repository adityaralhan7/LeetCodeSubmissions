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
int result=0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return result;
    }

    public void dfs(TreeNode root){
        if(root==null) return;
        int count=0;
        int sum[]=findSum(root,count);
        int avg=sum[0]/sum[1];
        if(avg==root.val) result++;
        dfs(root.left);
        dfs(root.right);
    }
    public int[] findSum(TreeNode root,int count){
        if(root==null) return new int[]{0,0};
        count++;
        int left[]=findSum(root.left,count);
        int right[]=findSum(root.right,count);
        return new int[]{left[0]+right[0]+root.val,left[1]+right[1]+1};
    }
}