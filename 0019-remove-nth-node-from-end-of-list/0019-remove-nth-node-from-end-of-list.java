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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        int rem=count-n;
        if(rem == 0)
            return head.next;
        curr=head;
        count=0;
        while(count<rem-1){
            curr=curr.next;
            count++;
        }
        
        curr.next=curr.next.next;
        return head;
    }
}