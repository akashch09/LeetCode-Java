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
    public int pairSum(ListNode head) {
        ListNode curr=head;
        int nodes=0;
        while(curr!=null){
            nodes++;
            curr=curr.next;
        }
        curr=head;
        int[] arr = new int [nodes];

        int i=0;
        while(curr!=null){
            arr[i]=curr.val;
            curr=curr.next;
            i++;
        }

        int maxi=0;
        int sum=0;
        int n=arr.length;
        for(i=0;i<n/2;i++){
            sum=arr[i]+arr[n-1-i];
            maxi=Math.max(maxi,sum);
        }

        return maxi;
        
    }
}