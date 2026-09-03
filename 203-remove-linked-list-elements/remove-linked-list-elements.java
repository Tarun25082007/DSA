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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return null;
        }
        
        
       while ( head.val == val){
        if ( head.next == null && head.val == val){
               head =null;
               break;
        }
        head = head.next ;
        

       }
       ListNode dh = new ListNode(0);
       dh.next = head ;
       ListNode curr = head;
while (curr != null && curr.next != null  ){
    if (curr.next.val == val ){
        curr.next = curr.next.next ;
    }
    else {
        curr = curr.next;
    }
    
}
       return dh.next ;

    }
}