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
    public String getDirections(TreeNode root, int start, int dest) {
        TreeNode lcaa=lca(root,start,dest);
        StringBuilder s1=path(lcaa,start);
        StringBuilder s2=path(lcaa,dest);
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s1.length();i++) res.append('U');
        for(int i=0;i<s2.length();i++) res.append(s2.charAt(i));
        return res.toString();
    }
    public TreeNode lca(TreeNode root,int n1,int n2){
        if(root==null) return root;
        if(root.val==n1||root.val==n2) return root;
        TreeNode l=lca(root.left,n1,n2);
        TreeNode r=lca(root.right,n1,n2);
        if(l!=null&&r!=null) return root;
        if(l==null&&r!=null) return r;
        return l; 
    }
    public StringBuilder path(TreeNode lcaa,int target){
        if(lcaa==null) return null;
        if(lcaa.val==target) return new StringBuilder();;
        StringBuilder left=path(lcaa.left,target);
        if(left!=null) return left.insert(0,'L');
        StringBuilder right=path(lcaa.right,target);
        if(right!=null) return right.insert(0,'R');
        return null;
    }
}