package BSTpackage;

public class NodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST newBST = new BST();
		newBST.addNode(5).addNode(4).addNode(2);
		Node runner = newBST.getHead();
		System.out.println(runner.getValue() + "head");
		while(runner != null) {
			
			if(runner.getLeft() != null) {
				runner = runner.getLeft();
				System.out.println(runner.getValue() + "left");
			} else if (runner.getRight() != null) {
				runner = runner.getRight();
				System.out.println(runner.getValue() + "right");
			} else {
				break;
			}
		}
		
	}

}
