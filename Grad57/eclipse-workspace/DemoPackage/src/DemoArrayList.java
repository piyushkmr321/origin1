import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(new Integer(234));
		list.add(90);
		list.add(46);
		list.add(90);
		int s=list.size();
		list.add(2,1000);
		list.remove(new Integer(900));
				System.out.println(list);
				

	}

}
