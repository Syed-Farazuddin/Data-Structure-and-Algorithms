package LinkedList.problems;

import LinkedList.LinkList;
// Leetcode 876.

public class getMid {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        LinkList.Node middle = list.getMiddle();

        LinkList.Node list2 = list.reverse(middle);
        LinkList.Node list1 = list.head;
        list.display(list2);

    }
}
