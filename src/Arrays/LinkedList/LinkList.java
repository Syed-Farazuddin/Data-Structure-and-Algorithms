package Arrays.LinkedList;
//Linked list custom implementation
public class LinkList {

    public Node head;
    private Node tail;
    private int size;
    LinkList(){
        this.size = 0;
    }

    private class Node{
        Node(int value){
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
}
