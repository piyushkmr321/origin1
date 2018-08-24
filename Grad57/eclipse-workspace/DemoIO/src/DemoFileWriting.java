import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter filewr =new FileWriter("abc.txt",true);
			filewr.write("city,pune");
			filewr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
