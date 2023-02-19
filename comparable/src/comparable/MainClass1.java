package comparable;

import java.util.TreeSet;

public class MainClass1 {

	public static void main(String[] args) {
		Employee e1=new Employee("Shashi",100000.00);
		Employee e2=new Employee("jani",200000.00);
		Employee e3=new Employee("Shree",400000.00);
		Employee e4=new Employee("maani",300000.00);
		Employee e5=new Employee("manju",600000.00);

		TreeSet<Employee> t=new TreeSet<Employee>();
		t.add(e1);
		t.add(e3);
		t.add(e5);
		t.add(e4);
		t.add(e2);
		for(Employee x:t) {
			System.out.println(x);
		}



	}

}
