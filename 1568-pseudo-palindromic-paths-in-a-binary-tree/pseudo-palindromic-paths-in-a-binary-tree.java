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
    int ans=0;
    int odd=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int arr[]=new int[10];
        solve(root,arr);
        return ans;
    }
    public void solve(TreeNode root,int arr[]){
       
        if(root==null) return;
        arr[root.val]++;
        if(root.left==null&&root.right==null){
            odd=0;
            for(int i=1;i<=9;i++){
                if(arr[i]%2!=0) odd++;
            }
            if(odd<=1) ans++;
        }
        solve(root.left,arr);
        solve(root.right,arr);
        arr[root.val]--;

    }
}