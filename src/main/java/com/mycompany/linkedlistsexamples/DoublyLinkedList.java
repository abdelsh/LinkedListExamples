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
public class DoublyLinkedList {
    private DoublyNode head, temp;
    
    List<DoublyNode> nodes = new ArrayList<>();

    public DoublyNode getHead() {
        return head;
    }

    public void setHead(DoublyNode head) {
        this.head = head;
        nodes.add(head);
    }

    public void addNode(DoublyNode past, DoublyNode value) {
        DoublyNode currentNode = head;
        
        for (int i = 0; i <= linkedListSize(); i++) {

            if (past == null) {
                temp = head;
                head = value;
                temp.setPast(value);
                value.setNext(temp);
                value.setPast(null);

                nodes.add(value);
                break;
            } else if (currentNode.equals(past)) {
                if (currentNode.getNext() == null) {
                    currentNode.setNext(value);
                    value.setNext(null);
                    value.setPast(currentNode);
                } else {
                    currentNode.getNext().setPast(value);
                    temp = currentNode.getNext();
                    currentNode.setNext(value);
                    value.setNext(temp);
                    value.setPast(currentNode);
                }

                nodes.add(value);
                break;
            }
            currentNode = currentNode.getNext();
        }
        
        printNodes(head);
    }

    public void deleteNode(DoublyNode value) {
        DoublyNode currentNode = head;
        
        for (int i = 0; i <= linkedListSize(); i++) {
            
            if (currentNode.getNext() != null){
                
                if (currentNode.equals(value)){
                    
                    head = head.getNext();
                    head.setPast(null);
                    printNodes(head);
                    break;
                    
                }else if (currentNode.getNext().equals(value)) {
                    
                    currentNode.setNext(value.getNext());
                    value.getNext().setPast(currentNode);
                    printNodes(head);
                    break;
                    
                }
                    currentNode = currentNode.getNext();
                
            } else {
                if (currentNode.equals(value)){
                    currentNode.getPast().setNext(null);
                    
                } else {
                    System.out.println("Couldn't find the value: " + value + " on the linked list.");

                }
            }
        }
    }

    public void searchNode(DoublyNode value) {
        int index = 0;
        boolean found = false, run = true;
        DoublyNode currentNode = head;

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

    public void printNodes(DoublyNode head) {
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

        System.out.println("Linked List:");

        DoublyNode currentNode = head;

        for (int i = 0; i <= linkedListSize(); i++) {
            if (currentNode.getPast() == null){
                System.out.print("[p: null"  + ", <v: " + currentNode.getValue() + ">, n: " + currentNode.getNext().getValue() + "]\n");
                currentNode = currentNode.getNext();

            }else if (currentNode.getNext() != null) {
                System.out.print("[p: " + currentNode.getPast().getValue() + ", <v: " + currentNode.getValue() + ">, n: " + currentNode.getNext().getValue() + "]\n");
                currentNode = currentNode.getNext();
            } else {
                System.out.print("[p: " + currentNode.getPast().getValue() + ", <v: " + currentNode.getValue() + ">, n: null]\n");
                break;
            }
        }
        System.out.println("");
    }
    
    public int linkedListSize () {
        int x = 0;
        DoublyNode currentNode = head;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
            x++;
        }
        return x;
    }
    
}
