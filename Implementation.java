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
public class Implementation {
Node head;

public void insert(int data)
{
Node n =new Node();
n.data=data;
n.next = null;
if(head == null)
{
head = n;
}
else
{
Node node= head;
while(node.next != null)
{
node = node.next;
} 
node.next = n;
}
}
public void insertAtStart(int data)
{
Node n =new Node();
n.data= data;
n.next=null;
n.next=head;
head = n;
}

public void insertAtIndex(int index, int data)
{
Node n = new Node();
n.data=data;
n.next=null;
if(index==0)
    insertAtStart(data);
else
{
Node node= head;
for(int i = 0; i <index-1; i++)
{
node = node.next;
} 
n.next = node.next;
node.next=n;
}
} 

public void deleteAtIndex(int index)
{
Node n = new Node();
n.next = null;
if(index==0)
{
    head=head.next;
}
else
{
Node node= head;
for(int i = 0;i<index-1;i++)
{
node = node.next;
}
Node n1;
n1= node.next;
node.next = n1.next;
n1= null;
} 
}
public void show()
{
Node node= head;
while (node.next != null)
{
System.out.print(node.data + " ");
node = node.next;
}
System.out.print(node.data);
} 
}
