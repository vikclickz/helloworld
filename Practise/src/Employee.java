
public class Employee {
	int age;
	int id;
	String name;
	public static void main(String args[])
	{
		
	    
		Employee e = new Employee();
		e.id = Integer.parseInt(args[0]);
		e.age = Integer.parseInt(args[1]);
		e.name = args[2];
		try{
			if(e.age>60)
			{
				throw new AgeException("age exception greater than 60");
				
			}
			else
			{
				System.out.println(" id \t"+e.id+"\n age \t"+e.age+"\n name \t"+e.name);
			}
		   }
		catch(AgeException e1)
		{
			System.out.println("age exception ");
			e1.printStackTrace();
		}
	}

}

class AgeException extends Exception
{
	public AgeException(String msg){
		super(msg);
	}
		
}