// Problem: Rotate List
// Platform: LeetCode
// Approach: Linked List traversal + circular connection
// cont n and and connect. last.next to the head and ......
// Date: 16-04-2026
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
// }
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        int n = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            n++;
        }
        k = k % n;
        temp.next = head;

        ListNode tailnull = head;
        for (int i = 0; i < n - k - 1; i++) {
            tailnull = tailnull.next;
        }
        head = tailnull.next;
        tailnull.next = null;

        return head;
    }
}