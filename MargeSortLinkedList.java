import IterativeSearchLinkedList.Node;

public class MargeSortLinkedList {
    node head = null;
    // node a, b;
    static class node {
        int val;
        node next;
 
        public node(int val)
        {
            this.val = val;
        }
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(LinkedList.Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;


        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;

        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next != null){
            return head;
        }
        //find mid
        Node mid = getMid();


        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();

    }
    
}
