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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;
        int n=1;
        ListNode curr=head;
        while(curr.next!=null){
            n++;
            curr=curr.next;
        }
        curr.next=head;
        k=k%n;
        k=n-k;
        int count=0;
        curr=head;
        while(count<k-1){
            curr=curr.next;
            count++;
        }
        ListNode newHead=curr.next;
        curr.next=null;
        return newHead;


    }
}