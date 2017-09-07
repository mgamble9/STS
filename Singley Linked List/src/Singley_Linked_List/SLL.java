package Singley_Linked_List;

public class SLL {
	
	private Node head;

	public SLL() {
		super();
		this.head = null;
	}
	
public SLL add(int e){
	Node current = head;
	Node nd = new Node(e);
	System.out.println("Adding: "+e);
 	if(head == null){
 		head = nd;
	} else {
		while (current.getNext() != null) {
			current = current.getNext();		
		}
		current.setNext(nd); 
	}
	return this;	
	}

public SLL display(){
	Node current = head;
 	if(current == null){
 		System.out.println("empty SLL");;
	} else {
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getNext();		
		}
	}
	return this;	
	}


public SLL remove(){
	Node current = head;
 	if(current == null){
 		System.out.println("empty SLL");
	} else if (current.getNext() == null) {
		head = null;
	} else {
		while (current.getNext().getNext() != null) {
			current = current.getNext();		
		}
		System.out.println("Removing " + current.getNext().getValue());
		current.setNext(null);
	}
	return this;	
	}

}
