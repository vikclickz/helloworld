import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadandDisplay {
	/* Reads the elements to be inserted in the Arraylist from console */
	public ArrayList<Integer> read(int s) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int listValue = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("Enter the List elements");
		do {
			listValue = Integer.parseInt(br.readLine());
			list.add(listValue);
		} while (listValue != s);

		return list;

	}

	/* Displays the contents of the ArrayList */
	public void display(ArrayList<Integer> list) {

		System.out.println("List Elements Are : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "  ");
		}

	}

}
