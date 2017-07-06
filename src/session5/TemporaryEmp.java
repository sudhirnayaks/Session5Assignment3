package session5;

public class TemporaryEmp extends Employee {
	int paid_leave=10, 
		sick_leave=15, 
		casual_leave=5;
	double basic, hra,pfa;

	
	void calulate_total_leaves() {
		total_leaves = paid_leave + sick_leave + casual_leave;
		System.out.println("Total Number of leaves "+total_leaves);
		
	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		return false;
	}

	@Override
	void calculate_salary() {
		pfa=0.12 * basic;
		hra=0.50 * basic;
		total_salary=basic+hra-pfa;
		System.out.println("The total salary of the employee is "+total_salary);
		
	}

}
