package linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node temp=a;

        printLinkedList(a);
        System.out.println();
        printLinkedListRecursively(a);
        System.out.println();
        printReverseLinkedList(a);
        System.out.println();
        findLengthOfLinkedList(a);
        System.out.println();
        insertNodeAtEndOfLinkedList(a,7);
        System.out.println();
        //insertNodeAtIndex(a,5,7);
        System.out.println();
        findMiddleElement(a);
        System.out.println();

    }

    private static void findMiddleElement(Node head) {
        Node temp=head;
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }

    private static void insertNodeAtIndex(Node a, int idx, int value) {
        Node temp=a;
        Node newvalue= new Node(value);
        int currentIndex=1;
        int bforIndx=idx-1;

        while (currentIndex<bforIndx && temp!=null){
            currentIndex++;
            temp=temp.next;
        }
        if (currentIndex==bforIndx){
            Node b=temp.next;
            temp.next=newvalue;
            newvalue.next=b;
        }
        printLinkedList(a);

    }

    private static void insertNodeAtEndOfLinkedList(Node a, int i) {

        Node temp=a;

        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(i);
        printLinkedList(a);
    }

    private static void findLengthOfLinkedList(Node a) {
        Node temp=a;
        int len=0;
        while (null!=temp){
            len++;
            temp=temp.next;
        }
        System.out.println("LinkedList Size="+len);
    }

    private static void printLinkedListRecursively(Node head) {
        if (head==null)return;
        System.out.print(head.data+"->");
        printLinkedListRecursively(head.next);
    }

    private static void printLinkedList(Node head) {
        Node temp=head;
        while (null!=temp){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    private static void printReverseLinkedList(Node head) {
        if (head==null) return;
        printReverseLinkedList(head.next);
        System.out.print(head.data+"->");
    }




}
