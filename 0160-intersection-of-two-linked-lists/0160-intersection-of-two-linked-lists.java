/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set=new HashSet<>();
        ListNode h1=headA;
        while(h1!=null){
            set.add(h1);
            h1=h1.next;
        }
        ListNode h2=headB;
        while(h2!=null){
            if(set.contains(h2))
            return h2;
            h2=h2.next;
        }
        return null;
    }
}