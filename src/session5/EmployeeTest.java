package session5;

import java.util.Scanner;

public class EmployeeTest {
    
		
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		PermanentEmp permanentEmp = new PermanentEmp();
		TemporaryEmp tempEmp = new TemporaryEmp();
		System.out.println("Enter P for Permanent Employee and T for Temporary Employee");
		char option = sc.next().charAt(0);
		
		switch(option){
		
		case 'P': System.out.println("Enter the basic salary of the employee");
		permanentEmp.basic=sc.nextDouble();
		permanentEmp.calculate_salary();
		permanentEmp.calulate_total_leaves();
		break;
		
		
        case 'T': System.out.println("Enter the basic salary of the employee");
        tempEmp.basic=sc.nextDouble();
        tempEmp.calculate_salary();
        tempEmp.calulate_total_leaves();
		
		}
	

	}

}
