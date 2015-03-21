
// Demonstrating the Exception Methods.
public class ExceptionMethods 
{
	public static void main(String[] args)
	{
	try
	{
	throw new Exception("Here's my Exception");
	}
	catch(Exception e) 
	{
	System.err.println("Caught Exception");
	System.err.println("e.getMessage(): " + e.getMessage());
	System.err.println("e.printStackTrace()");
	e.printStackTrace();
	System.err.println("e.getLocalizedMessage(): " +	e.getLocalizedMessage());
	}
	}
}