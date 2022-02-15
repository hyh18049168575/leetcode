package Offer2;



public class No21and22and23 {

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
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode pre = new ListNode(-1 , head);
        ListNode slow = pre;
        ListNode fast = pre;
        for (int i = 0;i < n;i++){
            fast = fast.next;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null &&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                fast = head;
                while (fast!=slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = len(headA);
        int b = len(headB);
        int c = Math.abs(b - a);
        while (c-- > 0){
            if (a>b)headA = headA.next;
            else headB = headB.next;
        }
        while (headA!=null&&headB!=null){
            if (headA == headB)return headA;
            else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
    private int len(ListNode head){
        int a = 0;
        while (head.next!=null){
            head = head.next;
            a++;
        }
        return a;
    }
}
