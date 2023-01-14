package easy;

import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        ListNode list1 = getRandomList(2);
        ListNode list2 = getRandomList(1);

        System.out.print("List 1 : ");
        printList(list1);
        System.out.println("List 2 : ");
        printList(list2);
        printList(mergeTwoLists(list1, list2));
    }

    private static ListNode getRandomList(int seed) {
        ListNode list = new ListNode(seed);
        ListNode temp = list;
        for (int i = seed ; i <= seed * 3; ++i){
            temp.next = new ListNode(i * seed);
            temp = temp.next;

        }
        return list;
    }

    static void printList(ListNode node){
        while (node != null){
            System.out.print(node.val + ", ");
            node = node.next;
        }
        System.out.println();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode resultList = new ListNode(0, null);
        ListNode tempResult = resultList;

        while(list1 != null && list2 != null){
            if (list1.val < list2.val){
                tempResult.next = list1;
                tempResult = tempResult.next;
                list1 = list1.next;
            }else if (list1.val > list2.val){
                tempResult.next = list2;
                tempResult = tempResult.next;
                list2 = list2.next;
            }else {
                tempResult.next = list1;
                tempResult = tempResult.next;
                list1 = list1.next;
                tempResult.next = list2;
                tempResult = tempResult.next;
                list2 = list2.next;
            }
        }

        if (list1 != null)
            tempResult.next = list1;
        else if (list2 != null)
            tempResult.next = list2;

        return resultList.next;

    }
}

class ListNode {


    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
