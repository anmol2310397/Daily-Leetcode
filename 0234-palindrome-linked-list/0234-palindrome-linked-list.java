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
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb=new StringBuilder();
        ListNode curr=head;
        while(curr!=null){
            sb.append(String.valueOf(curr.val));
            curr=curr.next;
        }
         StringBuilder reversed = new StringBuilder(sb).reverse();
        return sb.toString().equals(reversed.toString());
    }
}