import java.io.*;

public class FileQ {
	public static void main(String[] args) throws WrongNumber, IOException {
		if (args.length < 5 || args.length > 5) {
			throw new WrongNumber("enter 5 Strings");
		} else {
			System.out.println("new push");
			System.out.println("5 strings are");
			for (int i = 0; i < args.length; i++)
				System.out.println(args[i]);
			File f = new File("Text.txt");
			if (f.exists()) {
				FileOutputStream fos = new FileOutputStream("Text.txt", true);
				for (int i = 0; i < args.length; i++) {
					String s = args[i];
					byte b[] = s.getBytes();

					fos.write(b);
				}
			} else {
				FileOutputStream fos = new FileOutputStream("Text.txt");
				for (int i = 0; i < args.length; i++) {
					String s = args[i];
					byte b[] = s.getBytes();

					fos.write(b);
				}
			}
			FileInputStream fis = new FileInputStream("Text.txt");
			int i;
			System.out.println("Contents of file are");
			while ((i = fis.read()) != -1) {
				System.out.println((char) i);
			}
		}

	}

}

@SuppressWarnings("serial")
class WrongNumber extends Exception {
	WrongNumber(String msg) {
		super(msg);
	}
}