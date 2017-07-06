package session5;

abstract class Employee {
	
	int empID;
	String empName;
	int total_leaves;
	double total_salary;
	abstract void calulate_total_leaves();
	abstract boolean avail_leave(int no_of_leaves, char type_of_leave);
	abstract void calculate_salary();

}
