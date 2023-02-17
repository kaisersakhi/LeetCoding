package hard;

public class MergeKSortedLists {


    public static void main(String[] args) {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode[] lists = new ListNode[3];
        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(5);

        lists[0] = l1;

        ListNode l2 = //new ListNode(1);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);

        lists[1] = null;

        ListNode l3 = new ListNode(-1);
//        l3.next = new ListNode(6);
//        l3.next.next = new ListNode(6);

        lists[2] = l3;

        mergeKSortedLists.print(mergeKSortedLists.mergeKLists(lists));
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode resList = new ListNode(-1);
        boolean areWeDone = false;
        do {
            areWeDone = true;
            for (int i = 0; i < lists.length; ++i) {
                if (lists[i] != null) {
                    areWeDone = false;
                    insert(resList, lists[i].val);
                   // System.out.println(lists[i].val);
                    lists[i] = lists[i].next;
                }
            }
        } while (!areWeDone);
        return resList.next;
    }

    void insert(ListNode head, int val) {
        ListNode previous = head;
        ListNode current = head;
//        if (head.next == null) {
//            head.next = new ListNode(node.val);
//            return;
//        }
        while (current != null) {
            if (val < current.val) {
                previous.next = new ListNode(val);
                previous.next.next = current;
                return;
            }
            previous = current;
            current = current.next;
            if (current == null){
                previous.next = new ListNode(val);
            }
        }
    }

    void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
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


