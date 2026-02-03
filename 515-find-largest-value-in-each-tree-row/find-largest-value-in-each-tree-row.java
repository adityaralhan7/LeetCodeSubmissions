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
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int max=Integer.MIN_VALUE;
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode n=queue.poll();
                max=Math.max(max,n.val);
                if(n.left!=null) queue.offer(n.left);
                if(n.right!=null) queue.offer(n.right);
            }
            ans.add(max);
        }
        return ans;
    }
}