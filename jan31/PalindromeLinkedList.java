package com.java.jan31;

class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3(int x) { val = x; }
}

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode3 head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle of the linked list
        ListNode3 middleNode = findMiddle(head);

        // Step 2: Reverse the second half of the linked list
        ListNode3 reversedSecondHalf = reverseList(middleNode.next);
        middleNode.next = null;  // Cut the first half to separate it from the reversed second half

        // Step 3: Compare the reversed second half with the first half
        boolean isPalindrome = compareLists(head, reversedSecondHalf);

        return isPalindrome;
    }

    // Helper method to find the middle of a linked list
    private ListNode3 findMiddle(ListNode3 head) {
        ListNode3 slow = head;
        ListNode3 fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Helper method to reverse a linked list
    private ListNode3 reverseList(ListNode3 head) {
        ListNode3 prev = null;
        ListNode3 current = head;

        while (current != null) {
            ListNode3 nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

        return prev;
    }

    // Helper method to compare two linked lists
    private boolean compareLists(ListNode3 list1, ListNode3 list2) {
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }

        return true;
    }

    // Example usage
    public static void main(String[] args) {
        ListNode3 head1 = new ListNode3(1);
        head1.next = new ListNode3(2);
        head1.next.next = new ListNode3(2);
        // Add more nodes if needed

        PalindromeLinkedList solution = new PalindromeLinkedList();
        boolean isPalindrome = solution.isPalindrome(head1);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}

