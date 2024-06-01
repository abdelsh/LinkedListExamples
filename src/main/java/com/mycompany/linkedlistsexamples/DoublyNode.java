/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlistsexamples;

/**
 *
 * @author hp
 */
public class DoublyNode {
    private String Value;
    private DoublyNode next, past;

    public DoublyNode(String Value) {
        this.Value = Value;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public DoublyNode getPast() {
        return past;
    }

    public void setPast(DoublyNode past) {
        this.past = past;
    }
    
    @Override
    public String toString() {
//        return "[p: " + past.getValue() + ", v: " + Value + ", n: " + next.getValue() + "]\n";
        return Value;
    }
}
