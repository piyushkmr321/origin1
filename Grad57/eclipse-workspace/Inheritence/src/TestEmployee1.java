import java.util.Scanner;

import com.pojo.Employee;

public class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
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


	}

}
