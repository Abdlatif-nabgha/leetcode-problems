/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        ListNode slow = findMiddle(head);
        ListNode secondHalf = slow.next;
        slow.next = null;

        ListNode reversedSecond = reverse(secondHalf);
        merge(head, reversedSecond);
    }

    ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // prev
    //  2 -> 4 -> 6 -> 8

    ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
    
    void merge(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;

            l1.next = l2;
            if (l1Next != null) {
                l2.next = l1Next;
            }
            l1 = l1Next;
            l2 = l2Next;
        }
    }

}