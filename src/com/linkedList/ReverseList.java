package com.linkedList;

public class ReverseList {
    public ListNode reverseList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
        ListNode rev = null;
        ListNode slow = head;
        while(slow!=null){
            ListNode temp =slow.next;;
            slow.next = rev;
            rev = slow;
            slow = temp;

        }
        return rev;
    }
}
