package LinkedList.problems;

import LinkedList.LinkList;

public class ReverseList {
//    Reverse a Linked List --> Leetcode 206

    public static void main(String[] args) {
        LinkList list = new LinkList();
        int arr [] = {1,2,3,4,5};
        for(int i = 0; i < arr.length ; i++){
            list.add(arr[i]);
        }
//        list.display();
        list.reverse();
        list.display();
    }

}
