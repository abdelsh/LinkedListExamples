/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlistsexamples;

/**
 *
 * @author hp
 */
public class SinglyNode {
    private String Value;
    private SinglyNode next;

    public SinglyNode(String Value) {
        this.Value = Value;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public SinglyNode getNext() {
        return next;
    }

    public void setNext(SinglyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return  Value;
    }
}
