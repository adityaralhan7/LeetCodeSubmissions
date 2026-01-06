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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null) return -1;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        ArrayList<Long> list=new ArrayList<>();
        while(!queue.isEmpty()){
            long sum=0;
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode n=queue.poll();
                sum+=n.val;
                if(n.left!=null) queue.offer(n.left);
                if(n.right!=null) queue.offer(n.right);
            }
            list.add(sum);
        }
        Collections.sort(list);
        if(list.size()<k) return -1;
        return list.get(list.size()-k);
    }
}