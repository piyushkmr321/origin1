
public class DemoJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]values=new int[3][];
		values[0]=new int[3];
		values[1]=new int[2];
		values[2]=new int[4];
		
		values[0][0]=1;
		values[0][1]=2;
		values[0][2]=3;
		
		values[1][0]=4;
		values[1][1]=5;
		
		
		values[2][0]=6;
		values[2][1]=7;
		values[2][2]=8;
		values[2][3]=9;
		
		for(int [] arr:values)
		{
			
			for(int x:arr) {
				System.out.print(x+"\t");
			}
			System.out.println();
			
			
		}
			
		
		
		
		
		

	}

}
