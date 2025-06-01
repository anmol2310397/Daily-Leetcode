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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr=list1;
        int i=0;
        while(i!=a-1){
            curr=curr.next;
            i++;
        }
        ListNode curr2=curr;
        while(i!=b+1){
            curr2=curr2.next;
            i++;
        }
        curr.next=list2;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=curr2;
        return list1;
    }
}