//  Write a program in Java to delete the first occurrence of a key in a singly linked list


 class SinglyLinkedList {    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
    public Node head = null;    
    public Node tail = null;    
    public void addNode(int data) {    
        Node newNode = new Node(data);    
        if(head == null) {    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            tail.next = newNode;    
            tail = newNode;    
        }    
    }
    public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key){
        		Node currNode = list.head, prev = null; 
        		if (currNode != null && currNode.data == key){ 
            			list.head = currNode.next; // Changed head 
            			System.out.println(key + " found and deleted"); 
            			return list; 
        		} 
        		while (currNode != null && currNode.data != key){ 
            			prev = currNode; 
            			currNode = currNode.next; 
        		} 
        		if (currNode != null){ 
            			prev.next = currNode.next; 
            			System.out.println(key + " found and deleted"); 
        		} 
        		if (currNode == null){ 
            			System.out.println(key + " not found"); 
        		} 
        		return list; 
    	}

    public void display() {    
        Node current = head;    
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            System.out.print(current.data + " ");    
            current = current.next;             
        }    
        System.out.println();    
    }    
}
public class Main{
    public static void main(String[] args) {    
            
        SinglyLinkedList sList = new SinglyLinkedList();    
            
        //Add nodes to the list    
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);    
            
        //Displays the nodes present in the list    
        sList=sList.deleteByKey(sList,2);
        
        sList.display();    
    }    
}   

// by Ashwani Sharma 
