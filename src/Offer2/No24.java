package Offer2;

import java.util.List;
import java.util.Stack;

class No24and25 {
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        if (stack.isEmpty()){
            return null;
        }
        ListNode node = stack.pop();
        ListNode dummy = node;
        while (!stack.isEmpty()){
            ListNode tem = stack.pop();
            node.next = tem;
            node = node.next;
        }
        node.next = null;
        return dummy;
    }

    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next==null)return head;
        Stack<ListNode> stack = new Stack<>();
        while (head!=null){
            stack.push(head);
            head = head.next;
        }
        ListNode node = stack.pop();
        ListNode res = node;
        while (!stack.isEmpty()){
            ListNode a = stack.pop();
            node.next = a;
            node = node.next;
        }
        node.next = node;
        return res;
    }
//25
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (l1!=null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2!=null){
            s2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode ans = null;
        while (!s1.isEmpty() || !s2.isEmpty() || carry > 0){
            int a =s1.isEmpty()?0: s1.pop();
            int b =s2.isEmpty()?0: s2.pop();
            int c = a + b + carry;
            carry = c/10;
            c = c % 10;
            ListNode tem = new ListNode(c);
            tem.next = ans.next;
            ans.next = tem;
        }
        return ans.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode[] arr = new ListNode[100];
        ListNode[] brr = new ListNode[100];
        int pa = 0, pb = 0;
        while (l1 != null) {
            arr[pa++] = l1;
            l1 = l1.next;
        }
        while (l2 != null) {
            brr[pb++] = l2;
            l2 = l2.next;
        }
        int carry = 0;
        ListNode ans = new ListNode();
        while (pa > 0 || pb > 0 || carry > 0) {// carry>0 容易丢
            int cur = 0;
            cur += pa > 0 ? arr[--pa].val : 0;
            cur += pb > 0 ? brr[--pb].val : 0;
            cur += carry;
            carry = cur / 10;
            cur = cur % 10;
            ListNode ln = new ListNode(cur);
            ln.next = ans.next;
            ans.next = ln;
        }
        return ans.next;

    }
}
