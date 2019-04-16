public static Node reverse(Node head) {
        Node pre = null;
        Node post = null;
        while(head!=null) {
            post = head.next;
            head.next = pre;
            pre = head;
            head = post;
        }
        return pre;
    }
