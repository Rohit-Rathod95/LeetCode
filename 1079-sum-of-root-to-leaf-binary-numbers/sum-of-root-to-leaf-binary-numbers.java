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
    public int sumRootToLeaf(TreeNode root) {
        if(root==null) {
            return 0;
        }
        int sum=0;
        Stack<TreeNode> nodeStack=new Stack<>();
        Stack<Integer> valueStack=new Stack<>();
        nodeStack.push(root);
        valueStack.push(root.val);

        while(!nodeStack.isEmpty()) {
            TreeNode node=nodeStack.pop();
            int val=valueStack.pop();
            if(node.left==null && node.right==null) {
                sum=sum+val;
            }
            if(node.right!=null) {
                nodeStack.push(node.right);
                valueStack.push(val*2+node.right.val);
            } 
            if(node.left!=null) {
                nodeStack.push(node.left);
                valueStack.push(val*2+node.left.val);
            }
        }
        return sum;
    }
}