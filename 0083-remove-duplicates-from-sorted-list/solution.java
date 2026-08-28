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
    public ListNode deleteDuplicates(ListNode head) {  
        if (head == null){
            return null;
        }
        ListNode dh = new ListNode(0);
  dh.next=head; 
    ListNode i = head;
    ListNode j = head;
    while (j!= null){
        if (i.val == j.val){
            j = j.next;
            continue;
        }
        i.next=j;
        i=i.next;

    } 
    if (j==null){
        i.next=null;
    }
    return dh.next;
    }
}
