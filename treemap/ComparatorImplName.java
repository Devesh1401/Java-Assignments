package treemap;

import java.util.Comparator;

public class ComparatorImplName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpname().compareTo(o2.getEmpname());
		
	}
	
	

}
