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
        int sum=0;
        int carry=0;
        ListNode result = new ListNode();
        ListNode op = result;
        while(l1!=null && l2!=null)
        {
            sum=(l1.val+l2.val+carry)%10;
            carry=(l1.val+l2.val+carry)/10;
            l1=l1.next;
            l2=l2.next;
            ListNode digit = new ListNode(sum);
            result.next = digit;
            result=result.next;
        }
        if(l1==null)
            while(l2!=null)
                {   
                    sum=(l2.val+carry)%10;
                    carry=(l2.val+carry)/10;
                    ListNode digit = new ListNode(sum);
                    result.next = digit;
                    l2=l2.next;
                    result=result.next;
                }
        if(l2==null)
            while(l1!=null)
                {   
                    sum=(l1.val+carry)%10;
                    carry=(l1.val+carry)/10;
                    ListNode digit = new ListNode(sum);
                    result.next = digit;
                    l1=l1.next;
                    result=result.next;
                }
        if(carry!=0)
        {
            ListNode digit = new ListNode(carry);
            result.next = digit;
        }
        return op.next;
    }
}
