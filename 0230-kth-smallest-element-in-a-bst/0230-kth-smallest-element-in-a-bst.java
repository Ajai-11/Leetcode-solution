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
    public int kthSmallest(TreeNode root, int k) {
       List<Integer> list=new ArrayList<>();
       Queue<TreeNode> q=new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty()){
        TreeNode temp=q.poll();
        list.add(temp.val);
        if(temp.left!=null){
            q.offer(temp.left);
        }
        if(temp.right!=null){
            q.offer(temp.right);
        }
       }
       Collections.sort(list);
       return list.get(k-1);
    }
}