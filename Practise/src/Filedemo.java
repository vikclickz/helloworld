import java.io.*;

public class Filedemo  {

	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter id : ");
		String id = br.readLine();
		System.out.println("enter name");
		String name = br.readLine();
			File f = new File("C:/vik.txt");
			FileWriter fw = new FileWriter(f,true);
			fw.write("\n \n");
			fw.write("hello   "+id+"   \n   "+name);
			fw.close();
		
	}
}
