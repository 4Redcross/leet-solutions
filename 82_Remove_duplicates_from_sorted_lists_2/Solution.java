class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0), slow = dummy, fast = head;
        slow.next = head;

        while(fast != null) {
            while(fast.next != null && fast.val == fast.next.val) {
                fast = fast.next;
            }
            if(slow.next != fast) {
                slow.next = fast.next;
            } else {
                slow = slow.next;
            }
            fast = fast.next;
        }

        return dummy.next;
    }
}