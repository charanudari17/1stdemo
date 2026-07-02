// =============================================
// File: CopyRandomList.java
// Author: charanudari17
// Description: Copy List with Random Pointer
// =============================================

// 📅 Created & pushed on: 21-04-2026
// 🔹 Topic: Linked List (LeetCode 138)

class Solution {

    // 📌 Function to copy linked list with random pointer

    public Node copyRandomList(Node head) {

        // Base case
        if (head == null)
            return null;

        // 🔹 Step 1: Insert copy nodes in between original nodes

        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // 🔹 Step 2: Assign random pointers to copied nodes

        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // 🔹 Step 3: Separate original and copied list

        curr = head;
        Node dummy = new Node(0);
        Node copyTail = dummy;

        while (curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;

            copyTail.next = copy;
            copyTail = copy;

            curr = curr.next;
        }

        return dummy.next;
    }
}
