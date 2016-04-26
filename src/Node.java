
public class Node {
	
	private int element;
	private Node next;
	public Node(int element) {
		setElement(element);
		setNext(null);
	}
	
	public void setElement(int element) {
		this.element = element;
	}
	public int getElement() {
		return element;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getNext() {
		return next;
	}
}
