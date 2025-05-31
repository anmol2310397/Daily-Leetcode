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
    public ListNode middleNode(ListNode head){
        ListNode fast=head,slow=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode middle=middleNode(head);
        ListNode secondLL=reverse(middle);
        ListNode firstLL=head;
        while(secondLL.next!=null){
            if(secondLL.val!=firstLL.val)
            return false;
            secondLL=secondLL.next;
            firstLL=firstLL.next;
        }
        return true;
    }
}