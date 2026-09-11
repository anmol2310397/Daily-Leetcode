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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> A=new ArrayList<>();
        List<Integer> B=new ArrayList<>();
        List<Integer> C=new ArrayList<>();
        inorder(root1,A);
        inorder(root2,B);
        merge(A,B,C);
        return C;
    }
    void inorder(TreeNode root,List<Integer> li){
        if(root==null)return;
        inorder(root.left,li);
        li.add(root.val);
        inorder(root.right,li);
        return;
    }
    void merge(List<Integer> A,List<Integer> B,List<Integer> C ){
        int low1=0,low2=0;
        int high1=A.size()-1,high2=B.size()-1;
        while(low1<=high1 && low2<=high2){
            if(A.get(low1)<=B.get(low2)){
                C.add(A.get(low1));
                low1++;
            }
            else{
                C.add(B.get(low2));
                low2++;
            }
        }
        while(low1<=high1){
            C.add(A.get(low1));
            low1++;
        }
        while(low2<=high2){
            C.add(B.get(low2));
            low2++;
        }
    }
}