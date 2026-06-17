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
        int n1=0,n2=0;
        ListNode h1=headA,h2=headB;
        while(h1!=null){
            n1++;
            h1=h1.next;
        }
        while(h2!=null){
            n2++;
            h2=h2.next;
        }
        if(n1>n2){
           return collision(headA,headB,n1-n2);
        }
        else
           return collision(headB,headA,n2-n1);
    }
    public ListNode collision(ListNode h1,ListNode h2,int d){
        while(d>0){
            h1=h1.next;
            d--;
        }
        while(h1!=h2){
            h1=h1.next;
            h2=h2.next;
        }
        return h1;
    }
}