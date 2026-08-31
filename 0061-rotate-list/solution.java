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
class Solution {//4
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null){
            return head;
        }
        int size = 0;
        ListNode x = head ;
        while (x!=null){
            size++;
            x = x.next ;
        }
        if (k> size ){
            k = k% size ;
        }
        ListNode  y = head;
         ListNode temp = head;
        while ( k>0){
            y=head;
             while  (y.next.next != null){
                y = y.next;
             }
             temp = y.next;
             y.next = null;
             temp.next = head;
             head = temp;
            k--;
        }

        return head ;
    }
}
