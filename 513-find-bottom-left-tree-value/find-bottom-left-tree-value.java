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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null) return 0;
        int h=height(root);
        int hh=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            hh++;
            int size=queue.size();
            if(h==hh) return queue.poll().val;
            for(int i=0;i<size;i++){
                TreeNode n=queue.poll();
                if(n.left!=null) queue.offer(n.left);
                if(n.right!=null) queue.offer(n.right);
            }
        }
        return 0;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int l=height(root.left);
        int r=height(root.right);
        return 1+Math.max(l,r);
    }
    
}