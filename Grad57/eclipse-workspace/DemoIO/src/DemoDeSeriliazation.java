import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.pojo.Student;

public class DemoDeSeriliazation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fi =new FileInputStream("student.txt");
			ObjectInputStream oi =new ObjectInputStream(fi);
			Object object=oi.readObject();
			Student student=(Student) object;
			System.out.println(student.getName()+"\t"+student.getTotal());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
