
public class person2 {

	private int age;
	private String name;
	
	public void display() {
		System.out.println("name:"+name +"\t"+"age:"+age);
	}
	
	public person2()
	{
		age=22;
		name="piyush";
	}
	public person2(int age, String name)
	{
		this.age=age;
		this.name=name;
	}

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
	
}
