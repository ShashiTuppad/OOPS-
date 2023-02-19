package comparable;

import java.util.Comparator;

public class SortByName implements Comparator<Student>{
	
@Override
public int compare(Student x,Student y) {
	return x.name.compareTo(y.name);
	
}
}
