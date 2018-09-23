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
    
    //Deleting at last position
    
    public void deleteLast(){
        if(start==null)
            System.out.println("List is Empty");
        else if(size==1){
            start=null;
            size--;
        }
        else{
            Node t;
            t=start;
            for(int i=1;i<size-1;i++)
                t=t.getNext();
            t.setNext(null);
            size--;
        }
    }
    
    
    
    
    
    // Deleting at first position
    
    public void deleteFirst(){
        if(start==null)
            System.out.println("List is Empty");
        else{
            start=start.getNext();
            size--;
        }
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
    
    // Inserting at Last position
    
    public void insertAtLast(int val)
    {
        Node n,t;
        n=new Node();
        n.setData(val);
        t=start;
        if(t==null)
            start=n;
        else{
            while(t.getNext()!=null)
                t=t.getNext();
            t.setNext(n);
        }
        size++;
    }
    
    // inserting at position
    
    public void insertAtPos(int val, int pos)
    {
        if(pos==1)
            insertAtFirst(val);
        else if(pos==size+1)
            insertAtLast(val);
        else if(pos>1&&pos<=size)
        {
            Node n,t;
            n=new Node(val,null);
            t=start;
            for(int i=1;i<pos-1;i++)
                t=t.getNext();
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }
        else
            System.out.println("Insertion at this position not possible");
        
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