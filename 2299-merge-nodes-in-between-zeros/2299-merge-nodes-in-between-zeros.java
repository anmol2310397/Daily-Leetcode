class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0); 
        ListNode ans = dummy;

        int sum = 0;
        ListNode curr = head.next;
        while (curr != null) {
            if (curr.val == 0) {
                ans.next = new ListNode(sum);
                ans = ans.next;
                sum = 0;
            } else {
                sum += curr.val;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
