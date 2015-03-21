package stackqueue;

public class CareerStack {

	StackNode top;

	public Object pop() {
		if (top != null) {
			Object item = top.data;
			top = top.next;
			return item;
		}
		return null;
	}

	public void push(Object item) {
		if(null != item){
		StackNode node = new StackNode(item);
		node.next = top;
		top = node;
		}
	}

	public Object peek() {
		if (null != top) {
			return top.data;
		}
		return null;
	}

}
