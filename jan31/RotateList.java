package com.java.jan31;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        // Step 1: Find the length of the linked list
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        // Step 2: Calculate effective rotation amount
        int effectiveRotation = k % length;

        // If effective rotation is 0, no change needed
        if (effectiveRotation == 0) {
            return head;
        }

        // Step 3: Traverse to the node that will be the new head after rotation
        ListNode newHead = head;
        for (int i = 0; i < length - effectiveRotation - 1; i++) {
            newHead = newHead.next;
        }

        // Step 4: Break the list and update pointers
        ListNode rotatedHead = newHead.next;
        newHead.next = null;
        tail.next = head;

        return rotatedHead;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        RotateList solution = new RotateList();
        ListNode rotatedList1 = solution.rotateRight(head1, 2);
        printList(rotatedList1);

        ListNode head2 = new ListNode(0);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);

        ListNode rotatedList2 = solution.rotateRight(head2, 4);
        printList(rotatedList2);
    }
}
