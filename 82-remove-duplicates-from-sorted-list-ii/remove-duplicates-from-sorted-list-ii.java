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
class Solution {//6
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dh = new ListNode(0);
        dh.next = head;
        ListNode prev = dh ;
        ListNode c1 = head;
        ListNode c2 =head;
        int n = 0 ;
        while (c2 != null){
            if (c1.val == c2.val){
                n++;
                c2 = c2.next;

            }
            else if (n>1){
                prev.next = c2;
                c1 = c2; 
                n = 0;

            }
            else {
                prev = c1;
                c1= c1.next;
                n = 0 ;
            }

        }
        if (n>1){
            prev.next = c2;
        }
        return dh.next;
    
    
    
    
    
    }
}