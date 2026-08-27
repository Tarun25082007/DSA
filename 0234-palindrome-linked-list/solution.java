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
    public ListNode fuctionmid(ListNode head){
ListNode slow = head;
ListNode fast = head; 
while ( fast.next != null && fast.next.next != null ){
    slow = slow.next;
    fast = fast.next.next;

}
return slow;

    }
    public ListNode reverse(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode prev = head;
        ListNode current = head.next;
        while (current != null){
            ListNode next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head.next=null;
        head=prev;
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true;
        }
        ListNode middle = fuctionmid(head);
         ListNode cndhalfst = reverse(middle.next);
         ListNode csthlf = head;
         while (cndhalfst != null){
            if (cndhalfst.val != csthlf.val){
                return false;
            }
            csthlf=csthlf.next;
            cndhalfst = cndhalfst.next;
         }
         return true;
    }
}
