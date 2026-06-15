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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)return list2;
        if(list2==null)return list1;
        ArrayList<Integer>li=new ArrayList<>();
        ListNode l1=list1;
        ListNode l2=list2;
        while(l1!=null){
            li.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            li.add(l2.val);
            l2=l2.next;
        }
        Collections.sort(li);

        ListNode l=new ListNode(-1);
        ListNode dummy=l;
        for(int i:li){
            dummy.next=new ListNode(i);
            dummy=dummy.next;
        }
return l.next;
    }
}