
public class QueueDynamics {
	
	private Node head;
	private Node tail;
	private int size;
	public QueueDynamics() {
		this.head = null;
		this.tail = this.head;
		this.size = 0;
	}

	public void enqueue(int element) {
		Node no = new Node(element);
		if(isEmpty()) {
			this.head = no;
		} else {
			this.tail.setNext(no);
		}
		this.tail = no;
		this.size++;
	}
	
	public int dequeue() throws UnderflowException{
		if(isEmpty()) {
			throw new UnderflowException("A fila está vazia.");
		} else {
			int e = this.head.getElement();
			Node temp = this.head;
			this.head = temp.getNext();
			if(isEmpty()){
				this.tail = this.head;
			}
			temp = null;
			this.size--;
			return e;
		}
	}
	
	public int peek() throws UnderflowException{
		
		if (isEmpty()) {
			
			throw new UnderflowException("Fila está vazia.");
			
		} else {
			
			return this.head.getElement();
			
		}
		
	}
	
	public boolean isEmpty(){
		return this.head == null;
	}
	
	public String printQueue() {
		String temp = "head->";
		Node nodes = this.head;
		while(nodes != null){
			temp += "[" + nodes.getElement() + "]->";
			nodes = nodes.getNext();
		}
		temp += "null";
		return temp;
	}

	public boolean contains(int element) {
	
		boolean check = false;
		
		if(!isEmpty()) {
			
			Node nodes = this.head;
			while(nodes != null){
				if(nodes.getElement() == element){
					check = true;
					nodes = null;
				} else {
					nodes = nodes.getNext();
				}
				
			}
			
		}
		
		return check;
	}
	
	public Node getHead() {
		return head;
	}
	public Node getTail() {
		return tail;
	}
	public int getSize() {
		return size;
	}
}
