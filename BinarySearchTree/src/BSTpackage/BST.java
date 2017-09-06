package BSTpackage;

public class BST {
	private Node head;
	
	public BST() {
		this.head = null;
	}
	
	public boolean contains(int value) {
		Node runner = this.head;
		while (runner != null) {
			if (runner.getValue() == value) {
				return true;
			}
			if (value < runner.getValue()) {
				runner = runner.getLeft();
			}
			else {
				runner = runner.getRight();
			}
		}
		return false;
	}
	
	public BST addNode(int value) {
		Node runner = head;
		Node newNode = new Node(value);
		if (head == null) {	
			System.out.println(runner + "~~~~~~~");
			head = newNode;
			return this;
		} 
		while (runner != null) {
			if (value >= runner.getValue()) {
				if (runner.getRight() == null) {
					runner.setRight(newNode);
					break;
				}
				runner = runner.getRight();
			}
			if (value < runner.getValue()) {
				if (runner.getLeft() == null) {
					runner.setLeft(newNode);
					break;
				}
				runner = runner.getLeft();
			}
		}
		
		return this;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
}


