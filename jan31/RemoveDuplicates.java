package com.java.jan31;

class ListNode5 {
    int val;
    ListNode5 next;
    ListNode5(int x) { val = x; }
}

public class RemoveDuplicates {

    public ListNode5 deleteDuplicates(ListNode5 head) {
        ListNode5 current = head;

        // Iterate through the list
        while (current != null && current.next != null) {
            // Check if current node's value is equal to the next node's value
            if (current.val == current.next.val) {
                // Remove the duplicate node
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return head;
    }

    // Helper method to print the linked list
    public static void printList(ListNode5 head) {
        ListNode5 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        ListNode5 head1 = new ListNode5(1);
        head1.next = new ListNode5(1);
        head1.next.next = new ListNode5(2);

        RemoveDuplicates solution = new RemoveDuplicates();
        ListNode5 updatedList1 = solution.deleteDuplicates(head1);
        printList(updatedList1);

        ListNode5 head2 = new ListNode5(1);
        head2.next = new ListNode5(1);
        head2.next.next = new ListNode5(2);
        head2.next.next.next = new ListNode5(3);
        head2.next.next.next.next = new ListNode5(3);

        ListNode5 updatedList2 = solution.deleteDuplicates(head2);
        printList(updatedList2);
    }
}

