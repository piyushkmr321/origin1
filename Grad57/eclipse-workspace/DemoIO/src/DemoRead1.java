import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//		try {
//			System.out.println("enter name");
//			String name=br.readLine();
//			System.out.println("you entered"+name);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		try {
			System.out.println("enter two numbers");
			String a=br.readLine();
			int c=Integer.parseInt(a);
			String b=br.readLine();
			int d=Integer.parseInt(b);
			if (c>d)
			{
				System.out.println("a is greater");
			}
			else
				System.out.println("b is greater");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
