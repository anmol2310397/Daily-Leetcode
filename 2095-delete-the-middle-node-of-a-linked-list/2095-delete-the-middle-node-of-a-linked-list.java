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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)
    return null;
        int count=1;
        ListNode curr=head;
        while(curr.next!=null){
            count++;
            curr=curr.next;
        }
        int middle=count/2;
        count=0;
        curr=head;
        while(count<(middle-1)){
            curr=curr.next;
            count++;
        }
        curr.next=curr.next.next;
        return head;

        // System.out.println(count);
        // return curr;
    }
}