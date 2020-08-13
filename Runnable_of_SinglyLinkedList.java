/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author suriyaa
 */
public class Runnable_of_SinglyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Implementation_of_SinglyLinkedList linklst = new Implementation_of_SinglyLinkedList();
         linklst.insert(5);
         linklst.insert(7);
         linklst.insertAtStart(10);
         linklst.insertAtIndex(1,12);
         linklst.deleteAtIndex(2);
         linklst.show();
        // TODO code application logic here
    }
    
}
