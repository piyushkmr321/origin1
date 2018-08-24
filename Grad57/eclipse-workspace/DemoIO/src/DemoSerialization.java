import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.pojo.Student;

public class DemoSerialization {

	public static void main(String[] args)  throws IOException  {
		// TODO Auto-generated method stub

		Student st =new Student(12,300, "abcd");
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your name");
			String name=scanner.nextLine();
			System.out.println("enter your roll no.");
			int roll= scanner.nextInt();
			System.out.println("enter total marks");
			int marks=scanner.nextInt();
			Student student1=new Student(roll, marks, name);
			
			
			FileOutputStream fo =new FileOutputStream("student.txt");
			ObjectOutputStream oo =new ObjectOutputStream(fo);
			oo.writeObject(st);
			
			oo.writeObject(student1);
			oo.close();
			fo.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
