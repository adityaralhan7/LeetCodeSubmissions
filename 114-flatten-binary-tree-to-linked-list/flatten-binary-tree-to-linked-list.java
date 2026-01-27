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
    public void flatten(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        preorder(root,list);
        for(int i=1;i<list.size();i++){
            TreeNode newNode=new TreeNode();
            root.left=null;
            newNode.val=list.get(i);
            root.right=newNode;
            newNode.left=null;
            root=newNode;
        }
    }
    public void preorder(TreeNode root,List<Integer> list){
        if(root==null) return;
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}