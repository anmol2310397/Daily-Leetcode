/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;
        ListNode curr=new ListNode(-1);
        ListNode dummy=curr;
        int i=0;
        Stack<ListNode> st=new Stack();
        while(head!=null){
            if(i%k==0){
                while(!st.isEmpty()){
                dummy.next=st.pop();
                dummy=dummy.next;
                }
            }
            st.push(head);
            head=head.next;
            i++;
        }
        if(st.size()%k!=0){
        for(ListNode d:st){
            dummy.next=d;
            dummy=dummy.next;
        }
        }else{
            while(!st.isEmpty()){
                dummy.next=st.pop();
                dummy=dummy.next;
            }
        }
        dummy.next=null;
        return curr.next;
        
    }
}