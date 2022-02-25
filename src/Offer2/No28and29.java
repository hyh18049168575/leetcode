package Offer2;


import java.util.Stack;

public class No28and29 {
    class Node {
        public int val;
        public Node next;
        public Node prev;
        public Node child;
        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    };
    public Node flatten(Node head) {
        if (head == null)return null;
        Node newHead = new Node(0);
        Node prev = newHead;
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()){
            Node cur = stack.pop();
            prev.next = cur;
            cur.prev = prev;
            prev = cur;
            if (cur.next!=null)stack.push(cur.next);
            if (cur.child!=null){
                stack.push(cur.child);
                cur.child = null;
            }
        }
        newHead.next.prev = null;
        return newHead.next;
    }
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            head = new Node(insertVal);
            head.next = head;
            return head;
        }
        Node nodeA = head.next;
        Node nodeB = nodeA.next;
        while (nodeA != head) {
            if (checkInsert(nodeA, nodeB, insertVal)) {
                nodeA.next = new Node(insertVal, nodeB);
                return head;
            }
            nodeA = nodeB;
            nodeB = nodeB.next;
        }
        head.next = new Node(insertVal, head.next);
        return head;
    }

    private boolean checkInsert(Node nodeA, Node nodeB, int insertVal) {
        // 判断需要添加的值是否位于 nodeA 和 nodeB 之间
        if (nodeA.val <= nodeB.val) {
            // 链表：[1,3,4]，插入2
            return nodeA.val <= insertVal && insertVal <= nodeB.val;
        } else {
            // 链表：[4,2,3]，插入1 
            return nodeA.val <= insertVal || insertVal <= nodeB.val;
        }
    }

}
