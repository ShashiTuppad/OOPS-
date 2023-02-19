package comparable;

public class Employee implements Comparable<Employee> {
	String name;
	Double salary;
	Employee(String name,Double salary){
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "name: "+name+" salary; "+salary;
	}
	@Override
	public int compareTo(Employee e) {
		return e.salary.compareTo(this.salary);
	}
}
