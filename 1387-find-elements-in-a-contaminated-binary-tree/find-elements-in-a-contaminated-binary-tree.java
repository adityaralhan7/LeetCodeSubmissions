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
class FindElements {
    HashMap<Integer,Integer> map=new HashMap<>();
    public FindElements(TreeNode root) {
        dfs(root,0);
    }
    
    public boolean find(int target) {
        if(map.getOrDefault(target,0)>0){
        return true;
        }
        return false;
    }
    public void dfs(TreeNode root,int val){
        if(root==null) return;
        root.val=val;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        dfs(root.left,2*val+1);
        dfs(root.right,2*val+2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */