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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
ListNode dummyhead = new ListNode(0);
ListNode currnode = dummyhead ;
int val1,val2,val3;
int temp =0;
//dummy head is only present to show the starting of list when return
while(l1 != null || l2 !=null){
    val1 = (l1 ==  null)?0:l1.val;
       val2 = (l2 ==  null)?0:l2.val;
       val3=val1+val2+temp;
       if (val3>=10){
        temp=1;
        val3-=10;
       }
       else{
        temp=0;
       }
       currnode.next=new ListNode(val3);
       currnode=currnode.next;
      if (l1 != null){
        l1=l1.next;
      }  if (l2 != null){
        l2=l2.next;
      }
      
}  
if (temp==1){
    currnode.next=new ListNode(1);
}
return dummyhead.next;
    }
}
