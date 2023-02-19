package comparable;

import java.util.Comparator;

public  class SortByAge implements Comparator<Student> {
	@Override
	public int compare(Student a,Student b) {
		return a.age-b.age;
	}

}
