public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode cur = A;
        while (cur.next != null) {
            if (cur.next.val == cur.val) {
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        
        return A;
