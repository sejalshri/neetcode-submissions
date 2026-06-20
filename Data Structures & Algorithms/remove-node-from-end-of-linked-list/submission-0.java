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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr1 = head;
        ListNode curr2 = head;
        int count = 0;
        while (curr1 != null) {
            count++;
            curr1 = curr1.next;
        }
        int x = count - n;
        if(x==0){
            return head.next;
        }
        for (int i = 0; i < count - 1; i++) {
            if ((i + 1) == x) {
                curr2.next = curr2.next.next;
                break;
            }
            curr2 = curr2.next;
        }
        return head;
    }
}
