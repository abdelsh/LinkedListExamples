/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlistsexamples;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class CircularSinglyLinkedList {

    private SinglyNode head, temp, tail;

    List<SinglyNode> nodes = new ArrayList<>();

    public SinglyNode getHead() {
        return head;
    }

    public void setHead(SinglyNode head) {
        this.head = head;
    }

    public SinglyNode getTail() {
        return tail;
    }

    public void setTail(SinglyNode tail) {
        this.tail = tail;
    }

    public void addNode(SinglyNode value, SinglyNode next) {
        SinglyNode currentNode = head;

        if (head == null && tail == null) {
            setHead(value);
            setTail(next);
            head.setNext(tail);
            tail.setNext(head);
            nodes.add(value);
            nodes.add(next);
        } else {
            for (int i = 0; i < nodes.size(); i++) {
                if (next == head) {
                    
                    for (int j = 0; j < nodes.size() ; j++){
                        if (currentNode == tail){
                            
                            currentNode.setNext(value);
                            value.setNext(getHead());
                            setTail(value);
                            
                            break;
                        } else {
                            currentNode = currentNode.getNext();
                        }
                    }
                } else if (currentNode.getNext() == next){
                    
                    
                    temp = currentNode.getNext();
                    currentNode.setNext(value);
                    value.setNext(temp);
                    break;
                } else {
                    currentNode = currentNode.getNext();
                }
            }
            nodes.add(value);
        }
        
        tail.setNext(head);
        printNodes(head);


        
    }

    public void deleteNode(SinglyNode value) {
        SinglyNode currentNode = head;

        boolean deleted = false;
        
        for (int i = 0; i < nodes.size(); i++) {

            if (value == head) {
                tail.setNext(value.getNext());
                setHead(value.getNext());
                printNodes(head);
                break;
            } else if (currentNode.getNext().equals(value)){
                currentNode.setNext(value.getNext());
                printNodes(head);
                break;
            }
            currentNode = currentNode.getNext();
        }
        if (deleted == true) {
            System.out.println("Couldn't find the value: " + value + " on the linked list.");

        }
    }

    public void searchNode(SinglyNode value) {
        int index = 0;
        boolean found = false;
        SinglyNode currentNode = head;

        while (index < nodes.size()) {

            if (currentNode != value) {
                currentNode = currentNode.getNext();
                index++;
            } else {
                found = true;
                break;
            }

        }

        String str = (found) ? value + " Found at index " + index + ".\n" : "Value: " + value + " not found.\n";
        System.out.println(str);
    }

    public void printNodes(SinglyNode head) {
        System.out.print("Current ArrayList:    [");
        for (int i = 0; i <= nodes.size(); i++) {
            if (i != nodes.size() - 1) {
                System.out.print(nodes.get(i).toString() + ", ");
            } else {
                System.out.print(nodes.get(i).toString());
                break;
            }
        }
        System.out.println("]");

        System.out.print("Linked List:\n");

        SinglyNode currentNode = head;

        for (int i = 0; i < 10; i++) {
            if (currentNode != tail) {
                System.out.print("[<v: " + currentNode.getValue() + ">, n: " + currentNode.getNext().getValue() + "]\n");
                currentNode = currentNode.getNext();
            } else {
                System.out.print("[<v: " + currentNode.getValue() + ">, n: "+ currentNode.getNext().getValue() +"]\n");
                break;
            }
        }
        System.out.println("");
    }

    public int linkedListSize() {
        int x = 0;
        SinglyNode currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
            x++;
        }
        return x;
    }
}
