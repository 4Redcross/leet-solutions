public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean isLooped = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) {
                isLooped = true;
                break;
            }
        }

        if(isLooped){
            slow = head;
            while(true) {                
                if(slow == fast) {
                    return slow;
                }
                slow = slow.next;
                fast = fast.next;
            }
        } else {
            return null;
        }
    }
}
