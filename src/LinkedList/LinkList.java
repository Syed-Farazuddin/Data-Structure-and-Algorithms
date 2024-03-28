package LinkedList;
//Linked list custom implementation
    public class LinkList {
        public Node head;
        private Node tail;
        private int size;
        public LinkList(){
        this.size = 0;
    }

//    Node class
        public class Node{
            public Node(){

            }
            public Node(int value){
                this.val = value;
                this.next = null;
            }
            public Node next;
            public int val;
        }

//        Adding a new node at first
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

//        Adding a new node at last
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

//        Printing linked list
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
        }

//        Linked list reversal
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

        public Node getMiddle(){
            if(head == null|| head.next == null ) return head;
            Node slow = head, fast = head;
            do{
                slow = slow.next;
                fast = fast.next.next;
            }while(fast != null && fast.next != null);
            return slow;
        }

}
