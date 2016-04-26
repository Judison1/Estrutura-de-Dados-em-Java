
public class StackDynamics {
	
	private Node top;
	private int size;
	
	public StackDynamics() {
		
		this.top = null;
		this.size = 0;
		
	}
	
	public void push(int element) {
		
		Node no = new Node(element);
		no.setNext(this.top);
		this.top = no;
		this.size++;
	}
	
	public int pop() throws UnderflowException {
		
		if(isEmpty()){
			throw new UnderflowException("A Pilha está vazia.");
		} else {
			int e = this.top.getElement();
			Node temp = this.top;
			this.top = temp.getNext();
			temp = null;
			this.size--;
			return e;
		}
		
	}
	
	public int peek() throws UnderflowException{
		
		if(isEmpty()){
			throw new UnderflowException("A Pilha está vazia.");
		} else {
			return this.top.getElement();
		}
		
	}
	
	public boolean isEmpty() {
		return this.top == null;
	}
	
	public String printStack(){
		String temp = "top->";
		Node nodes = this.top;
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
			
			Node nodes = this.top;
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
	
	public Node getTop() {
		return top;
	}
	
	public int getSize() {
		return size;
	}
}
