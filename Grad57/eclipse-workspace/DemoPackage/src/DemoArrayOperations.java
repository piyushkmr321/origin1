import java.util.Arrays;

public class DemoArrayOperations {
	public static void main(String[] args) {
		int [] numbers= {123,34,55,65,43,55,67,89,90};
		
        //Arrays.fill(numbers, 0);
		//	for(int num:numbers)
		//{
		//	System.out.println(num);
		//}
		
        Arrays.fill(numbers, 1,4,100);
		
		for(int num:numbers)
		{
			System.out.println(num);
		}
		System.out.println("--------");
		int [] arr_cpy=Arrays.copyOf(numbers,5);
		
		for(int num:arr_cpy)
		{
			System.out.println(num);
		}
		
		System.out.println("--------");
		
		String [] names= {"abc","xyz","sdf"};
		String [] names1= {"abc","xyz","sdf"};
		boolean t=Arrays.equals(names, names1);
				System.out.println(t);
				
				System.out.println("--------");
				
				Arrays.sort(numbers);
		
				for(int num:numbers)
				{
					System.out.println(num);
				}
				
				System.out.println("--------");
				
				int index=Arrays.binarySearch(numbers, 900);
				System.out.println(index);
		
		
		
		
	}

}
