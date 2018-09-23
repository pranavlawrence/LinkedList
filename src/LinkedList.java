/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranav Aditya
 */
public class LinkedList {

    private int size;
    private Node start;

    public LinkedList() {
        size = 0;
        start = null;
    }
    
    // Inserting at First posotion
    
    
    public void insertAtFirst(int val)
    {
        Node n;
        n=new Node();
        n.setData(val);
        n.setNext(start);
        size++;
        
    }

    
    // Method for checking if the list is empty or not 
    
    
    public boolean isEmpty() {
        if (start == null)
            return true;
        else 
            return false;               
    }
    
    
    public int getListSize(){
        return(size);
}
    
    
    //Method for viewing list
    
    
    public void viewList(){
        Node t;
        if(isEmpty())
            System.out.println("List is Empty");
        else {
            t=start;
            for(int i=1;i<=size;i++)
            {
                System.out.println(" "+t.getData());
                t=t.getNext();
            }
    }
    
    }
    
}