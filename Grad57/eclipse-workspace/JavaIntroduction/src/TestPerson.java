
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
person p; // stack memory loc
p=new person();// heap memory loc
//p.setValues();
p.display();



p= new person(12, "abc");
//p.setValues(20,"roy");
p.display();
p.setAge(1000);
p.display();
System.gc();

	}

}
