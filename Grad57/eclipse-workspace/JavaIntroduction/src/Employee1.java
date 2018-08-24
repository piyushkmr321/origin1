
public class Employee1 {
private int age;
private String name;


public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

	public void showEmployeeDetails()
	{
		System.out.println("Employee name="+name+"\t age="+age);
	}
	public static void main(String[]args)
	{
		Employee1 e;
		e=new Employee1();
		e.setName("piyush");
		e.setAge(22);
		e.showEmployeeDetails();
		
	}
}
