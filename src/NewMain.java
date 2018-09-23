/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 *
 * @author Pranav Aditya
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        boolean flag=true;
        while(flag){
            System.out.println(" ");
            System.out.println("1.Add at starting position");
            System.out.println("2.Add at last position");
            System.out.println("3.Add at choice position");
            System.out.println("4.Delete starting position");
            System.out.println("5.Delete Last position");
            System.out.println("6.Delete choice position");
            System.out.println("7.View list");
            System.out.println("8.Exit");
            System.out.println("Enter your Choice");
            int choice=sc.nextInt();
            int position,val;
            switch(choice){
                case 1: System.out.println("Enter value of list item");
                        val=sc.nextInt();
                        list.insertAtFirst(val);
                        break;
                        
                case 2: System.out.println("Enter value of list item");
                        val=sc.nextInt();
                        list.insertAtLast(val);
                        break;
                        
                case 3: System.out.println("Enter Position");
                        position=sc.nextInt();
                        System.out.println("Enter value of list item");
                        val=sc.nextInt();
                        list.insertAtPos(val, position);
                        break;
                        
                case 4: list.deleteFirst();
                        break;
                        
                case 5: list.deleteLast();
                        break;
                        
                case 6: System.out.println("Enter Postition");
                        position=sc.nextInt();
                        list.deletePos(position);
                        break;
                        
                case 7: list.viewList();
                        break;
                        
                case 8: flag=false;
                        break;
                    
                default:System.out.println("Invalid Choice");
            }
        }
        
        
    }
    
    
}
