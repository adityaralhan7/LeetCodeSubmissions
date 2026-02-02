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
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        int level=0;
        int b=0;
        int maxSum=Integer.MIN_VALUE;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            b++;
            int sum=0;
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode n=queue.poll();
                sum+=n.val;
                if(n.left!=null) queue.offer(n.left);
                if(n.right!=null) queue.offer(n.right);
            }
            if(sum>maxSum){
                level=b;
                maxSum=sum;
            }
        }
        return level;
    }
}