package com.java.jan31;

class ListNode4 {
    int val;
    ListNode4 next;
    ListNode4(int x) { val = x; }
}

public class RemoveElements {

    public ListNode4 removeElements(ListNode4 head, int val) {
        // Handle edge case where the list is empty
        if (head == null) {
            return null;
        }

        // Create a dummy node to simplify edge cases where the head needs to be removed
        ListNode4 dummy = new ListNode4(0);
        dummy.next = head;
        ListNode4 current = dummy;

        // Iterate through the list and remove nodes with the specified value
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Skip the node with the specified value
            } else {
                current = current.next; // Move to the next node
            }
        }

        return dummy.next; // Return the updated head after removals
    }

    // Helper method to print the linked list
    public static void printList(ListNode4 head) {
        ListNode4 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        ListNode4 head1 = new ListNode4(1);
        head1.next = new ListNode4(2);
        head1.next.next = new ListNode4(6);
        head1.next.next.next = new ListNode4(3);
        head1.next.next.next.next = new ListNode4(4);
        head1.next.next.next.next.next = new ListNode4(5);
        head1.next.next.next.next.next.next = new ListNode4(6);

        RemoveElements solution = new RemoveElements();
        ListNode4 updatedList1 = solution.removeElements(head1, 6);
        printList(updatedList1);

        ListNode4 head2 = null;

        ListNode4 updatedList2 = solution.removeElements(head2, 1);
        printList(updatedList2);

        ListNode4 head3 = new ListNode4(7);
        head3.next = new ListNode4(7);
        head3.next.next = new ListNode4(7);
        head3.next.next.next = new ListNode4(7);

        ListNode4 updatedList3 = solution.removeElements(head3, 7);
        printList(updatedList3);
    }
}

