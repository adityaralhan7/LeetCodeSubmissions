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

    int max=0;
    public int longestZigZag(TreeNode root) {
        if(root==null) return 0;
        zigzag(root,0,true);
        zigzag(root,0,false);
        return max;
    }
    public void zigzag(TreeNode root,int steps,boolean goLeft){
        if(root==null) return;
        max=Math.max(max,steps);
        if(goLeft==true){
            zigzag(root.left,steps+1,false);
            zigzag(root.right,1,true);
        }
        else{
            zigzag(root.right,steps+1,true);
            zigzag(root.left,1,false);
        }
        
    }
}