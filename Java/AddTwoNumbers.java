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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode iter = result;

        int carry = 0;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                iter.val = (l1.val + l2.val + carry) % 10;
                if (l1.val + l2.val + carry > 9) {
                    carry = 1;
                } else {
                    carry = 0;
                }
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                iter.val = (l1.val + carry) % 10;
                if (l1.val + carry > 9) {
                    carry = 1;
                } else {
                    carry = 0;
                } 
                l1 = l1.next;
            } else {
                iter.val = (l2.val + carry) % 10;
                if (l2.val + carry > 9) {
                    carry = 1;
                } else {
                    carry = 0;
                } 
                l2 = l2.next;
            }
            if (l1 == null && l2 == null) {
                break;
            }
            iter.next = new ListNode();
            iter = iter.next;
        }

        if (carry == 1) {
            iter.next = new ListNode();
            iter = iter.next;
            iter.val = carry;
        }

        return result;
    }
}
