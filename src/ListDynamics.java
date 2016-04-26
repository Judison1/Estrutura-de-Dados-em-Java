
public class ListDynamics {

	private TwoWayNode head;
	private TwoWayNode tail;
	private int size;
	
	public ListDynamics() {
		
		this.tail = this.head = null;
		this.size = 0;
		
	}
	
	public void addFirst(int element) {
		
		TwoWayNode node = new TwoWayNode(element);
		
		if(isEmpty()) {
			
			this.tail = this.head = node;
		
		} else {
			
			this.head.setPrevious(node);
			node.setNext(this.head);
			this.head = node;
			
		}
		
		this.size++;
	
	}
	
	
	public void addLast(int element) {
		
		if(isEmpty()) {
			
			addFirst(element);
		
		} else {
			
			TwoWayNode node = new TwoWayNode(element);
			node.setPrevious(this.tail);
			this.tail.setNext(node);
			this.tail = node;
			
			this.size++;
			
		}
		
	}
	
	public void add(int index, int element) throws IndexOutOfBoundsException {
		
		if(indexExists(index)) {
			
			throw new IndexOutOfBoundsException("Indice não encontrado!");
			
		} else {
			
			if(index == 0) {
				
				addFirst(element);
				
			} else if(index == this.size){
				
				addLast(element);
				
			} else {
				
				TwoWayNode node = new TwoWayNode(element);
				
				TwoWayNode tmpLeft = nodeAt(index);
				
				TwoWayNode tmpRight = (TwoWayNode) tmpLeft.getNext();
				
				node.setPrevious(tmpLeft);
				node.setNext(tmpRight);
				
				tmpLeft.setNext(node);
				tmpRight.setPrevious(node);
				
			}
			
		}
		
	}
	
	public int removeFirst() throws UnderflowException {
		
		if(isEmpty()) {
			
			throw new UnderflowException("A Lista está Vazia!");
		
		} else {
			
			TwoWayNode tmp = this.head;
			
			this.head = (TwoWayNode) tmp.getNext();
			this.head.setPrevious(null);
			this.size--;
			
			return tmp.getElement();
		}
		
	}
	
	public int removeLast() throws UnderflowException {
		
		if(isEmpty()) {
			
			throw new UnderflowException("A Lista está Vazia!");
			
		} else {
			
			TwoWayNode tmp = this.tail;
			
			this.tail = tmp.getPrevious();
			this.tail.setNext(null);
			this.size--;
			
			return tmp.getElement();
			
		}
		
	}
	
	public int remove(int index, int element) throws UnderflowException, IndexOutOfBoundsException {
		
		if(isEmpty()) {
			
			throw new UnderflowException("A Lista está Vazia!");
			
		} else if(!indexExists(index)) {
			
			throw new IndexOutOfBoundsException("O indice não existe.");
			
		} else {
			
			TwoWayNode tmp = nodeAt(index);
			
			TwoWayNode tmpLeft = tmp.getPrevious();
			
			TwoWayNode tmpRight = (TwoWayNode) tmp.getNext();
			
			tmpLeft.setNext(tmpRight);
			tmpRight.setPrevious(tmpLeft);
			
			return tmp.getElement();
			
		}
		
	}
	
	public int peekFirst() throws UnderflowException {
		
		if(isEmpty()) {
			
			throw new UnderflowException("Lista está vazia");
		
		} else {
			
			return this.head.getElement();
			
		}
		
	}

	public int peekLast() throws UnderflowException {
		if(isEmpty()) {
			
			throw new UnderflowException("Lista está vazia");
		
		} else {
			
			return this.tail.getElement();
			
		}
		
	}
	
	
	public int peek(int index) throws IndexOutOfBoundsException {
		
		return elementAt(index);
	
	}
	
	public String printList(){
		
		String temp = "head";
		
		if(isEmpty()) {
			
			temp += "->[null]";
			
		} else {
		
			TwoWayNode nodes = this.head;
			
			while(nodes != null){
				
				temp += "<->[" + nodes.getElement() + "]";
				nodes = (TwoWayNode) nodes.getNext();
				
			}
			
		}
		
		temp += "<-tail";
		
		return temp;
	}
	
	public TwoWayNode nodeAt(int index) throws IndexOutOfBoundsException{
		
		if(index < 0 || index > this.size) {
			
			throw new IndexOutOfBoundsException("Indice não encontrado!");
			
		}else {
			
			TwoWayNode tmp;
			
			
			if(index <= (this.size / 2)){
				
				tmp = this.head;
				
				for (int i = 1; i < index; i++) {
					System.out.println(i);
					tmp = (TwoWayNode) tmp.getNext();
				}
				
			} else {
				
				tmp = this.tail;
				
				for (int i = this.size; i > index; i--) {
					System.out.println(i);
					tmp = tmp.getPrevious();
				}
				
			}
			
			return tmp;
		}
		
	}
	
	public int elementAt(int index) throws IndexOutOfBoundsException {
		
		if(indexExists(index)) {
			
			throw new IndexOutOfBoundsException("Indice não encontrado.");
			
		} else{
			
			return nodeAt(index).getElement();
			
		}
		
	}
	
	public int indexAt(int element) throws IndexOutOfBoundsException, UnderflowException {
		
		if(isEmpty()){
			
			throw new UnderflowException("Lista Vazia.");
			
		} else {
		
			TwoWayNode tmp = this.head;
			int index = 0;
			
			while(tmp != null) {
				
				if(tmp.getElement() == element) {
					
					return index;
					
				} else {
					
					tmp = (TwoWayNode) tmp.getNext();
					
				}
				
			}
			
			throw new IndexOutOfBoundsException("Elemento não Encontrado!");
			
		}
	}
	
	public boolean isEmpty(){
		return this.size == 0;
	}
	
	public boolean indexExists(int index){
		return (index < 0 || index > this.size);
	}

	public TwoWayNode getHead() {
		return head;
	}
	
	public TwoWayNode getTail() {
		return tail;
	}
	
	public int getSize() {
		return size;
	}
}
