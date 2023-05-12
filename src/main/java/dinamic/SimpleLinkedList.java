package dinamic;

import java.util.Random;

public class SimpleLinkedList {

    int data;
    SimpleLinkedList next;
    SimpleLinkedList(int d) {
        data = d;
        next = null;
    }

    public static SimpleLinkedList removeDuplicates(SimpleLinkedList head) {
        for(SimpleLinkedList simpleLinkedList = head; simpleLinkedList != null; simpleLinkedList = simpleLinkedList.next){
            while (simpleLinkedList.next != null && simpleLinkedList.data == simpleLinkedList.next.data){
                simpleLinkedList.next = simpleLinkedList.next.next;
            }
        }
        return head;
    }

    public static SimpleLinkedList insertNode(SimpleLinkedList head, int data){
        SimpleLinkedList p = new SimpleLinkedList(data);

        if(head==null)
            head = p;
        else if(head.next==null)
            head.next = p;
        else
        {
            SimpleLinkedList start = head;
            while(start.next!=null)
                start = start.next;
            start.next = p;

        }
       return head;
    }

    public static SimpleLinkedList insert(SimpleLinkedList head, int data) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList(data);
        SimpleLinkedList current = null;
        if(head == null){
            head = simpleLinkedList;
        }
        else{
            current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = simpleLinkedList;
        }
        return current;
    }

    public static void display(SimpleLinkedList head) {
        SimpleLinkedList start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Random random = new Random(10);
        SimpleLinkedList head = null;
        int N = 5;

        while(N-- > 0) {
            int ele = 1;
            head = insertNode(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
    }
}
