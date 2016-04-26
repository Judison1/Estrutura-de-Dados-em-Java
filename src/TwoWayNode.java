
public class TwoWayNode extends Node{

	private TwoWayNode previous;
	
	public TwoWayNode(int element) {
		super(element);
		setPrevious(null);
		setNext(null);
	}
	
	public void setPrevious(TwoWayNode previous) {
		this.previous = previous;
	}
	
	public TwoWayNode getPrevious() {
		return previous;
	}
}
