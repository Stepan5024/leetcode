package Reverse_Linked_List_206;

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

        ListNode node3 = new ListNode(4);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node4 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

       ListNode root =  reverseList(node1);
       while (root != null) {
           System.out.println(root.val);
           root = root.next;
       }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return  prev;
    }
}
