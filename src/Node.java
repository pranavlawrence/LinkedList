/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranav Aditya
 */
class Node {
    private int data;
    private Node next;

      
    public Node(){
        data=0;
        next=null;
    }
    
    public Node(int d,Node n){
        data=d;
        next=n;
    }
    
    public int getData() {
        return data;
    }

    public void setData(int d) {
        this.data = d;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        this.next = n;
    }
    
           
    
}
