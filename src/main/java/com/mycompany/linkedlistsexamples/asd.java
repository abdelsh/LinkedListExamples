/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlistsexamples;

import java.io.*;
/**
 *
 * @author hp
 */
public class asd {}
    



// A linked list node

class Node {    
    int data;
    Node next;
}
 

// Class to insert element in LL

class LinkedList {

Node head; // head of list

// Given a reference (pointer to pointer)

// to the head of a list and an int, inserts

// a new node on the front of the list.
void insertAtFront(int new_data) {

// 1. allocate node
Node new_node = new 
Node();

// 2. put in the data
new_node.data = 
new_data;

// 3. Make next of new node as head
new_node.next = head;

// 4. move the head to point to the new node
head = new_node; }


// This function prints contents of

// linked list starting from head

void printList(){
    Node node = head;

while (node != null) {

System.out.print(node.data + " ");

node = node.next;}


System.out.println();

}
    
    
}
