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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyhead = new ListNode(0);
        ListNode l3 =dummyhead;
        
        while (list1 != null || list2 !=null)
    {
        
        if ((list2 == null && list1 != null) || ( list1 != null && list1.val<=list2.val  ) ){
                 l3.next = list1;
                 list1=list1.next;
                 l3 = l3.next;
        }
        else if ( ( list1 == null && list2 != null) || (list2 != null && list1.val>=list2.val ) ){
              l3.next = list2;
                 list2=list2.next;
                 l3 = l3.next;
        }
    }
    return dummyhead.next;}
}
