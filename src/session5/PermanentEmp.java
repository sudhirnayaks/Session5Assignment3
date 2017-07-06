package session5;

public class PermanentEmp extends Employee {
	int paid_leave = 24;
	int sick_leave = 30;
	int casual_leave = 10;
	double basic, hra,pfa;
	
	
	void calulate_total_leaves() {
		total_leaves = paid_leave + sick_leave + casual_leave;
		System.out.println("Total Number of leaves "+total_leaves);
		
	}
	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	void calculate_salary() {
		pfa=0.12 * basic;
		hra=0.50 * basic;
		total_salary=basic+hra-pfa;
		System.out.println("The total salary of the employee is "+total_salary);
		
	}	
	
	void print_leave_details(){
		System.out.println("The Employee is  assigned with below number of leaves :"+"\nPaid Leave: "+paid_leave+"\nSick Leave "+sick_leave+"\nCasual Leave "+casual_leave);
			
		}

	

}
