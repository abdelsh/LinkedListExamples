/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedlistsexamples;


/**
 *
 * @author hp
 */
public class LinkedListsExamples {
    public static void main(String[] args) {
        
        SinglyLinkedList slist = new SinglyLinkedList();
        DoublyLinkedList dlist = new DoublyLinkedList();
        CircularSinglyLinkedList cslist = new CircularSinglyLinkedList();

        
        SinglyNode abdelsalam =new SinglyNode("Abdelsalam");
        SinglyNode ahmad =new SinglyNode("ahmad");
        SinglyNode ali =new SinglyNode("ali");
        SinglyNode yousef =new SinglyNode("yousef");
        SinglyNode asd = new SinglyNode("asd");
        
        slist.setHead(abdelsalam);
        
        slist.addNode(null, ahmad);
        slist.addNode(abdelsalam, ali);
        slist.addNode(null, yousef);
        slist.searchNode(asd);
        slist.deleteNode(abdelsalam);
        
        System.out.println("\n\n====================\n\n");
        
        DoublyNode abdelsalamd =new DoublyNode("Abdelsalam");
        DoublyNode ahmadd =new DoublyNode("ahmad");
        DoublyNode alid =new DoublyNode("ali");
        DoublyNode yousefd =new DoublyNode("yousef");
        DoublyNode asdd = new DoublyNode("asd");
        
        dlist.setHead(abdelsalamd);
        
        dlist.addNode(null, ahmadd);
        dlist.addNode(abdelsalamd, alid);
        dlist.addNode(null, yousefd);
        dlist.searchNode(asdd);
        dlist.deleteNode(abdelsalamd);
        
        System.out.println("\n\n====================\n\n");

        
        
        
        cslist.addNode(abdelsalam, ahmad);
        cslist.addNode(ali, abdelsalam);
        cslist.addNode(yousef, ali);
        cslist.searchNode(asd);
        cslist.deleteNode(abdelsalam);
    }
    
}















