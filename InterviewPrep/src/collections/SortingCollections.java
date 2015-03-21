package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class SortingCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student(2, "asd");
		Student s2 = new Student(4, "pqr");
		System.out.println(s2.compareTo(s1));
		LinkedList<Student> s = new LinkedList<>();
		s.add(new Student(1, "Vikrant"));
		s.add(new Student(4, "Aanmay"));
		s.add(new Student(3, "Yash"));
		s.add(new Student(0, "Sid"));
		TreeSet<String> set = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		set.add("fds");
		set.add("zxc");
		set.add("abz");
		for (String string : set) {
			System.out.println(string);
		}
		for (Student student : s) {
			System.out.println(student.id +" :: "+ student.name);
		}
		Collections.sort(s);
		System.out.println("after sorting");
		for (Student student : s) {
			System.out.println(student.id +" :: "+ student.name);
		}
		Collections.sort(s, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				System.out.println(o1.name.compareToIgnoreCase(o2.name));
				return o1.name.compareToIgnoreCase(o2.name);
			}
		
		});
		System.out.println("after name sorting");
		for (Student student : s) {
			System.out.println(student.id +" :: "+ student.name);
		}
	}

}
