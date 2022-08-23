package MyOwn.tasks.addNumbers;

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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();

        return new ListNode();
    }

    public static void main(String[] args) {
        ListNode obj1 = new ListNode(1, new ListNode(2, new ListNode(9)));
        ListNode obj2 = new ListNode(3, new ListNode(4, new ListNode(7)));

        System.out.println(addTwoNumbers(obj1, obj2).val);
    }
}
