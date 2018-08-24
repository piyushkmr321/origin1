import java.util.Scanner;

import com.pojo.Employee;
import com.pojo.EmployeeIO;

public class EmployeeIOImpl implements EmployeeIO {

	@Override
	public Employee readEmployee() {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your Id");
		int id=s.nextInt();
		System.out.println("Enter your salary");
		int sal=s.nextInt();
		System.out.println("Enter your age");
		int age=s.nextInt();
		System.out.println("Enter your name");
//		s.nextLine();
		String name=s.next();
		

		Employee emp=new Employee(id,sal,age,name);
		emp.display();

		
		
		return emp;
	}

	@Override
	public void writeEmployee(Employee employee) {
		// TODO Auto-generated method stub
employee.display();
	}

}
