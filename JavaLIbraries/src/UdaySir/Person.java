package UdaySir;

public class Person {
	int age;
	String name;
	Person(int age, String name){
		this.name=name;
		this.age=age;
	}
	
	
	@Override
	public String toString() {
		return "name is: "+name+" Age is: "+age;
	}
	public static void main(String[] args) {
		Person p=new Person(22,"shashi");
		Person p1=new Person(24,"jaani");
		
		System.out.println(p);
		System.out.println(p1.name);
		System.out.println(p1.toString());
		System.out.println("==================================");
		
		Person[] p2= {p,p1};
		
		for(Person shashi:p2) {
			System.out.println(shashi);
		}
	}

}
