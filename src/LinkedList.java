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
    
    
    
}