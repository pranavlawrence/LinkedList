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

    public boolean isEmpty() {
        if (start == null)
            return true;
        else 
            return false;               
    }
    public int getListSize(){
        return(size);
}
    
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