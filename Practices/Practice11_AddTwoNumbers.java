package Practices;

public class Practice11_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        while (l1.next!=null) {
           first= first.append(l1);
        }

        while (l2.next!=null) {
            second= second.append(l2);
        }
        return l1;
    }


    private ListNode nodeL1(){
        ListNode resL1 = new ListNode(2);
        resL1.next = new  ListNode(4);
        resL1.next = new  ListNode(3);
        return resL1;
    }

}
  class ListNode {
      int val;
     ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }