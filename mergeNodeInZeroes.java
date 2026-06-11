// mergeNodeInZeroes.java

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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        int sum=0;
        ListNode curr=head.next;
        while(curr!=null){
            if(curr.val!=0){
                sum+=curr.val;
            }else{
                ListNode newNode= new ListNode(sum);
                tail.next=newNode;
                tail=tail.next;
                sum=0;
            }
            curr=curr.next;
        }


     return dummy.next;   
    }
}