import java.io.*;
public class BufferedTest
{
	
	public static void main(String args[])
	{
	int nextByte;
	try
	{
	BufferedInputStream bi = new BufferedInputStream(new FileInputStream("C://vik.txt"));
	FileInputStream fis = new FileInputStream("test.dat");
	BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("vik",true));
	while((nextByte =  bi.read()) != -1)
	{
	bo.write(nextByte);
	System.out.print((char) nextByte);
	}
	
	bi.close();
	bo.close();
	fis.close();
	}
	
	catch(IOException e) {  }
	}
}