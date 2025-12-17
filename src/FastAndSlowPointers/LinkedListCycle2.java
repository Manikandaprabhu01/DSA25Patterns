package FastAndSlowPointers;

public class LinkedListCycle2 {
    public static void main(String[] args) {
        LinkedListCycle2 solution = new LinkedListCycle2();

        // Creating a linked list with a cycle for testing
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a cycle here

        ListNode cycleStartNode = solution.detectCycle(head);
        if (cycleStartNode != null) {
            System.out.println("Cycle starts at node with value: " + cycleStartNode.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode ptr1 = head;
                ListNode ptr2 = slow;
                while(ptr1 != ptr2){
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
                return ptr1;
            }
        }
        return null;
    }
}
