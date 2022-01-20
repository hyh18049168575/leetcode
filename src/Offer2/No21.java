package Offer2;



public class No21 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    private int lenth(ListNode head){
        int len = 0;
        while (head != null){
            len++;
            head = head.next;
        }
        return len;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        int last = lenth(head) - n;
        if (last == 0){
            return head.next;
        }
        for (int i = 0;i<last - 1;i ++){
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
