package UdaySir;

public class Student {
	int age;
	Student(int age){
		this.age=age;
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		return this.age==s.age;

	}
	public static void main(String[] args) {
		Student s1=new Student(22);
		Student s2=new Student(23);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
	}
}
