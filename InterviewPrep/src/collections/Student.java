package collections;

public class Student implements Comparable {
	
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(Object arg) {
		Student s = (Student) arg;
		
		return this.id < s.id ? -1 : this.id > s.id ? 1 : 0;
	}
	

}
