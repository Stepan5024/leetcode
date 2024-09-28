package Merge_Two_Sorted_Lists_21;

public class Solution {


    public static class ListNode {
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


    public static void main(String[] args) {
//list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]


        ListNode node3 = new ListNode(4);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;



        ListNode node6 = new ListNode(4);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        node4.next = node5;
        node5.next = node6;
        ListNode node = mergeTwoLists(node1, node4);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;


        }
        curr.next = list1 == null ? list2 : list1;

        return dummyHead.next;
    }
}
