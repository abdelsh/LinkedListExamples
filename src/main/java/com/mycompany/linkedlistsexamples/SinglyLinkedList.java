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
public class SinglyLinkedList {

    private SinglyNode head, temp;
    
    List<SinglyNode> nodes = new ArrayList<>();

    public SinglyNode getHead() {
        return head;
    }

    public void setHead(SinglyNode head) {
        this.head = head;
        nodes.add(head);
    }

    public void addNode(SinglyNode past, SinglyNode value) {
        for (int i = 0; i <= nodes.size(); i++) {

            SinglyNode currentNode = nodes.get(i);

            if (past == null) {
                temp = head;
                head = value;
                value.setNext(temp);

                nodes.add(value);
                break;
            } else if (currentNode.equals(past)) {
                if (currentNode.getNext() == null) {
                    currentNode.setNext(value);
                } else {
                    temp = currentNode.getNext();
                    currentNode.setNext(value);
                    value.setNext(temp);
                }

                nodes.add(value);
                break;
            }
        }
        printNodes(head);
    }

    public void deleteNode(SinglyNode value) {
        SinglyNode currentNode = head;
        
        for (int i = 0; i <= linkedListSize(); i++) {
            
            if (currentNode.getNext() != null){
                if (currentNode.equals(value)){
                    head = head.getNext();
                    printNodes(head);
                    break;
                }else if (currentNode.getNext().equals(value)) {
                    currentNode.setNext(value.getNext());
                    printNodes(head);
                    break;
                }
                    currentNode = currentNode.getNext();
                
            } else {
                if (currentNode.equals(value)){
                    currentNode = null;
                } else {
                    System.out.println("Couldn't find the value: " + value + " on the linked list.");

                }
            }
        }
    }

    public void searchNode(SinglyNode value) {
        int index = 0;
        boolean found = false, run = true;
        SinglyNode currentNode = head;

        while (index <= nodes.size()) {
            if (currentNode.getNext() != null) {
                if (currentNode != value){
                    currentNode = currentNode.getNext();
                    index++;
                } else{
                    found = true;
                    break;
                }
            } else {
                break;
            }
        }

        String str = (found) ? value + " Found at index " + index + ".\n" : "Value: " + value + " not found.\n";
        System.out.println(str);
    }

    public void printNodes(SinglyNode head) {
        System.out.print("Current ArrayList:    [");
        for (int i = 0; i < nodes.size(); i++) {
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

        for (int i = 0; i <= linkedListSize(); i++) {
            if (currentNode.getNext() != null) {
                System.out.print("[<v: " + currentNode.getValue() + ">, n: " + currentNode.getNext().getValue() + "]\n");
                currentNode = currentNode.getNext();
            } else {
                System.out.print("[<v: " + currentNode.getValue() + ">, n: null]\n");
                break;
            }
        }
        System.out.println("");
    }
    
    public int linkedListSize () {
        int x = 0;
        SinglyNode currentNode = head;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
            x++;
        }
        return x;
    }
}
