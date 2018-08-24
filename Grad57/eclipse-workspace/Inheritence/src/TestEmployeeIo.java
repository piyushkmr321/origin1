import com.pojo.Employee;
import com.pojo.EmployeeIO;

public class TestEmployeeIo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//EmployeeIOImpl employee=new EmployeeIOImpl();
//employee.writeEmployee(employee.readEmployee());
//	
		EmployeeIO employeeIO=new EmployeeIO() {
			
			@Override
			public void writeEmployee(Employee employee) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Employee readEmployee() {
				// TODO Auto-generated method stub
				System.out.println("hi");
				return null;
			}
		};
		
		employeeIO.readEmployee();
		
		
		}
	

}
