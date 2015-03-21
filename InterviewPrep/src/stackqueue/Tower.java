package stackqueue;

import java.util.Stack;

public class Tower {
	
	private Stack<Integer> disks;
	private int index;
	
	public Tower(int i){
		this.disks = new Stack<>();
		this.index = i;
	}
	
	public void add(int d){
		if(!disks.isEmpty() && disks.peek() <= d){
			System.out.println("Error placing disk "+d);
		}else{
			disks.push(d);
		}
	}
	
	public void moveTopTo(Tower t){
		int top = disks.pop();
		t.add(top);
	}
	
	public void moveDisks(int n, Tower destination, Tower buffer){
		if(n>0){
		moveDisks(n-1, destination, buffer);
		moveTopTo(destination);
		buffer.moveDisks(n-1, destination, this);
		}
	}

}
