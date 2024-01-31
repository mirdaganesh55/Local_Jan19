package com.java.jan31;

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) { val = x; }
}

public class ReverseLinkedList {

    // Iterative approach
    public ListNode2 reverseListIterative(ListNode2 head) {
        ListNode2 prev = null;
        ListNode2 current = head;

        while (current != null) {
            ListNode2 nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

        return prev;
    }

    // Recursive approach
    public ListNode2 reverseListRecursive(ListNode2 head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode2 reversedList = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return reversedList;
    }

    // Helper method to print the linked list
    public static void printList(ListNode2 head) {
        ListNode2 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
    // Example usage

