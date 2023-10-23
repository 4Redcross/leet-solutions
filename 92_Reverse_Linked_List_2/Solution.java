class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy;

        // Part 1 - Traverse till starting node of list that needs to be reversed
        for(int i=0; i < left - 1; i++){
            start = start.next;
        }

        ListNode tail = start.next;
        // Part 2 - Reverse the sub-list
        for(int i=0; i < right - left; i++) {
            ListNode temp = start.next;
            start.next = tail.next;
            tail.next = tail.next.next;
            start.next.next = temp;
        }

        return dummy.next;
    }
}
