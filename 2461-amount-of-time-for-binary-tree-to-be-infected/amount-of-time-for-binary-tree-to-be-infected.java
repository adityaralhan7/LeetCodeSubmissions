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
    HashMap<TreeNode,TreeNode> map=new HashMap<>();//{child,parent}
    HashSet<TreeNode> set=new HashSet<>();
    public int amountOfTime(TreeNode root, int start) {
        parent(root);
        int ans=0;
        Queue<TreeNode> queue=new LinkedList<>();
        TreeNode st=find(root,start);
        set.add(st);
        queue.offer(st);
        while(!queue.isEmpty()){
            int flag=1;
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode n=queue.poll();
                if(map.get(n)!=null&&!set.contains(map.get(n))){
                    flag=0;
                    queue.offer(map.get(n));
                    set.add(map.get(n));
                }
                if(n.left!=null&&!set.contains(n.left)){
                    set.add(n.left);
                    flag=0;
                    queue.offer(n.left);
                }
                if(n.right!=null&&!set.contains(n.right)){
                    flag=0;
                    set.add(n.right);
                    queue.offer(n.right);
            }
            }
            if(flag==0) ans++;
        }
        return ans;
    }
    public void parent(TreeNode root){
        if(root==null) return;
        if(root.left!=null) map.put(root.left,root);
        parent(root.left);
        if(root.right!=null) map.put(root.right,root);
        parent(root.right);
    }
    public TreeNode find(TreeNode root,int target){
        if(root==null) return null;
        if(root.val==target) return root;
        TreeNode left=find(root.left,target);
        if(left!=null) return left;
        return find(root.right,target);
    }
}