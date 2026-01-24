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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(root,targetSum,list,ans);
        return ans;
    }

    public void solve(TreeNode root,int target,List<Integer> list,List<List<Integer>> ans){
        if(root==null) return;
        
            target-=root.val;
            list.add(root.val);
        if(root.left==null&&root.right==null){
            if(target==0){
                ans.add(new ArrayList<>(list));
                list.remove(list.size()-1);
                return;
            }
        }
        solve(root.left,target,list,ans);
        solve(root.right,target,list,ans);
        list.remove(list.size()-1);
    }
}