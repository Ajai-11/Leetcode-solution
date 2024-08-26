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
    public void inorder(TreeNode root,List<Integer> list){
        if(root==null)
        return ;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);

    }
    public int rangeSumBST(TreeNode root, int low, int high) {
      int sum=0;
      List<Integer> list=new ArrayList<>();
      inorder(root,list);
      for(int i=0;i<list.size();i++){
       if(list.get(i)>high)
       break;
        if(list.get(i)>=low&&list.get(i)<=high)
        sum=sum+list.get(i);
      }
      return sum;  
    }
}