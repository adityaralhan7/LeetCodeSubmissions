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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans=new ArrayList<>();
        solve(root,ans,"");
        return ans;
    }
    public void solve(TreeNode root,ArrayList<String> ans,String str){
        if(root==null) return;
        if(str.length()!=0) str+="->";
        str+=String.valueOf(root.val);
        if(root.left==null&&root.right==null) ans.add(str);
        solve(root.left,ans,str);
        solve(root.right,ans,str);
    }
}