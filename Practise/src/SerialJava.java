import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SerialJava  {
	public static void main(String args[]){
		
		try {
			
			ObjectSerial os = new ObjectSerial("vikrant",1,20000);
			System.out.println("Object serial : "+os);
			
			FileOutputStream fos = new FileOutputStream("C:/serial.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(os);
			oos.flush();
			oos.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
			System.exit(0);
		}
		try {
			
			ObjectSerial os1;
			FileInputStream fis = new FileInputStream("C:/serial.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			os1 = (ObjectSerial) ois.readObject();
			ois.close();
			System.out.println("Object 2 : "+os1);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.exit(0);
		}
		
		
	}
}


class ObjectSerial implements Serializable{

	String name;
	int id;
	double sal;

	public ObjectSerial(String name, int id, double sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
		
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
	return "name = "+"\"" + name + "\"" + "|" +" id ="+ id +"|" +"sal =" + sal;
	}
	
	
	
	
}
