package LinkedList;
//Linked list custom implementation
    public class LinkList {
        public Node head;
        private Node tail;
        private int size;
        public LinkList(){
        this.size = 0;
    }

        public class Node{
            public Node(){

            }
            public Node(int value){
                this.val = value;
                this.next = null;
            }
            Node next;
            int val;
        }
        public void addAtFirst(int value){
            Node node = new Node(value);
            if(head == null && tail == null){
                head = node;
                tail = node;
            }else{
                node.next = head;
                head = node;
            }
        }
        public void add(int value){
            Node node = new Node(value);
            if(head == null && tail == null){
                head = node;
                tail = node;
            }else{
                tail.next = node;
                tail = node;
            }
        }
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
        }
        public void reverse(){
            Node prev = null;
            Node curr = head;
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
}
