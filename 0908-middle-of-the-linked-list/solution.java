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
    public ListNode middleNode(ListNode head) {
        ListNode dh = new ListNode (0);
        ListNode s = head;
        ListNode f = head;
        while (true)
        {
            if (f == null || f.next == null){
                dh.next = s;
                return dh.next;
            }
            s=s.next;
            f = f.next.next;
        }
        
    }
}
