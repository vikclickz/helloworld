package collections;

import java.util.Comparator;

public class NodeComparator implements Comparator<NodeList> {

	@Override
	public int compare(NodeList o1, NodeList o2) {
		if(o1.data < o2.data){
			return 1;
		}else{
			return -1;
		}
//		return o1.data-o2.data;
	}

	
}
