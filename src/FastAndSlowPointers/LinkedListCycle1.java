package FastAndSlowPointers;

public class LinkedListCycle1 {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedListCycle1 solution = new LinkedListCycle1();

        // Creating a linked list with a cycle for testing
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a cycle here

        boolean result = solution.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + result);
    }
}
