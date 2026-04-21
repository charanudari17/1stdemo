// File: SortList.java
// Author: Charan
// Description: Sort Linked List using Merge Sort

// 📅 Pushed on: 21-04-2026 and solved 20-04
// 🔹 Topic: Linked List - Merge Sort (LeetCode 148)

class Solution {


    public ListNode sortList(ListNode head) {

        // Base case
        if (head == null || head.next == null) return head;

        // 🔹 Step 1: Find middle using slow & fast pointer
        
        ListNode slow = head, fast = head, prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // 🔹 Break the list into two halves

        prev.next = null;

        // 🔹 Step 2: Recursively sort both halves
       
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // 🔹 Step 3: Merge sorted halves
       
        return merge(l1, l2);
    }

    // 📌 Merge two sorted linked lists
    
    private ListNode merge(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        // 🔹 Compare and merge
     
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        // 🔹 Attach remaining nodes
     
        temp.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }
}
