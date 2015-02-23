import java.io.*;
public class FileReadWrite
{
	public static byte[] getInput() throws IOException
	{
	byte inp[]  = new byte[50];
	System.out.println("Enter text");
	for(int i=0;i<20;i++)
	{
	inp[i] = (byte) System.in.read();
	}
	return inp;
	}

	public static void main(String args[]) throws IOException 
	{
	byte input[] = getInput();
	FileOutputStream fout = new FileOutputStream("C:/lmn.txt");
	for(int i=0;i<50;i++)
	{
	fout.write(input[i]);
	}
	fout.close();		
	int size;
	FileInputStream fin =  new FileInputStream("C:/lmn.txt");
	size = fin.available();
	System.out.println("Reading contents from the file");

	for(int i=0;i<size;i++)
	{
	System.out.print((char)fin.read());
	}
	fin.close();
	}
}
