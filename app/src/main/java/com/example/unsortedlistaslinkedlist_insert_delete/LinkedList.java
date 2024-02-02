package com.example.unsortedlistaslinkedlist_insert_delete;

public class LinkedList {
    Node head;

    public LinkedList(Node head){
        this.head = head;
    }

    void addToEnd(int data){
        Node n = new Node(data);
        if (head == null) {
            head = n;
        }
        else{
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = n;
        }
    }

    void addToStart(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    Node deleteLast(){
        Node curr = head;
        if(curr == null || curr.next == null){
            head = null;
            return curr;
        }
        Node nextNode = curr.next;
        while (curr.next != null) {
            if (nextNode.next == null) {
                curr.next = null;
            }
            curr = nextNode;
            nextNode = nextNode.next;
        }
        return curr;
    }

    Node deleteStart(){
        if (head != null) {
            Node toDelete = head;
            head = head.next;
            return toDelete;
        }
        return null;
    }
}
