import java.util.ArrayList;

public class Merge {
	public ArrayList<Integer> merge(ArrayList<Integer> l, ArrayList<Integer> m) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (result.size() < (l.size() + m.size())) {
			if (l.size() > i && m.size() > j) // checks if the two indexes have
				// not incremented
				// past the size of the two
				// input arrays
			{
				if (l.get(i) < m.get(j)) {
					result.add(l.get(i++));
				} else {
					result.add(m.get(j++));
				}
			} else if (l.size() > i) {
				result.add(l.get(i++));
			} else if (m.size() > j) {
				result.add(m.get(j++));
			}
		}
		return result;
	}
}