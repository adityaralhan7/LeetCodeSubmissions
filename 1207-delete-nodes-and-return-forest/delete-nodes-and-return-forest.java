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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:to_delete) set.add(n);
        ArrayList<TreeNode> result=new ArrayList<>();
        delHelper(root,set,result);
        if(set.contains(root.val)) return result;
        result.add(root);
        return result;
    }
    public TreeNode delHelper(TreeNode root,HashSet<Integer> set,ArrayList<TreeNode> result){
        if(root==null) return null;
        root.left=delHelper(root.left,set,result);
        root.right=delHelper(root.right,set,result);
        if(set.contains(root.val)){
            if(root.left!=null) result.add(root.left);
            if(root.right!=null) result.add(root.right);
            return null;
        } 
        else return root;
    }
}