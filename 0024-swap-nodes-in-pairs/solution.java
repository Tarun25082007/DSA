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
    public void reverse (ListNode head,ListNode prev){
        if (head.next == null){
            return;
        }
        ListNode temp = head.next.next;
        ListNode temp2 =head.next;        head.next.next=head;
        head.next = temp;
      
        prev.next =temp2;
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null){
            return null;
        }
        if (head.next == null ){
            return head;
        }
        ListNode dh = new ListNode(0);
        ListNode curr = dh;
        curr.next=head;
        curr=curr.next;
        ListNode prev = dh;
       ListNode temp1 ;
        ListNode temp ;
        while(curr != null && curr.next!=null ){
            temp = curr.next.next;
             temp1 = curr;
            reverse(curr,prev);
            prev=temp1;
            curr=temp;
            
        }
        return dh.next;

        
    }
}
