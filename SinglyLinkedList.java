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
public class SinglyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Implementation sll = new Implementation();
         sll.insert(5);
         sll.insert(7);
         sll.insertAtStart(10);
         sll.insertAtIndex(1,12);
         sll.deleteAtIndex(2);
         sll.show();
        // TODO code application logic here
    }
    
}
