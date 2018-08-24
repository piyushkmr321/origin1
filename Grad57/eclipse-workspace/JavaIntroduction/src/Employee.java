
public class Employee {
	
  private int empId;
  private double salary;
  private String empName,companyName;
  
  public Employee()
  {
	  
	  empId=10;
	  empName="city";
	  salary=10000;
	  companyName="city LTD";
	  
  }
  
  public Employee(int empId, String empName, double salary)
  {
	  this();
	  this.empId=empId;
	  this.empName=empName;
	  this.salary=salary;
	
	  
  }
  public void display()
  {
	  System.out.println(empName+"\t"+empId+"\t"+companyName);
	  
	  
  }
  public static void main(String[]args)
  {
	  Employee emp=new Employee(120,"emp name1",12000);
	  emp.display();
  }
  
  
}
