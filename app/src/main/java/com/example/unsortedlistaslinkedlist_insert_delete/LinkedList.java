package com.example.unsortedlistaslinkedlist_insert_delete;

// this class for linked list for project it has more than function (addToEnd - deleteStart - ......)
public class LinkedList {
    Node head;

    public LinkedList(Node head){
        this.head = head;
    }

    void addToEnd(String data){
        Node n = new Node(Integer.parseInt(data));
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

    void addToStart(String data){
        Node n = new Node(Integer.parseInt(data));
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
