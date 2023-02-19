package comparable;

import java.util.TreeSet;

public class TestMain {
	public static void main(String[] args) {
		Student s1=new Student("Shashi", 22);
		Student s2=new Student("Jani", 24);
		Student s3=new Student("Shree", 25);
		Student s4=new Student("Prashant", 21);
		Student s5=new Student("Abhi", 28);
		Student s6=new Student("Shivu", 23);

		TreeSet<Student> t=new TreeSet<Student>(new SortByAge());
		t.add(s6);
		t.add(s1);
		t.add(s3);
		t.add(s2);
		t.add(s5);
		t.add(s4);
		for(Student x:t) {
			System.out.println(x);
		}




	}

}
