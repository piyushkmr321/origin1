package day4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.nio.file.ClosedFileSystemException;
import java.util.Scanner;

public class DemoStringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="citi";
		System.out.println(name);
		name=name.concat(",pune");
		System.out.println(name);

//		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the string");
//		String string=scanner.nextLine();
//		System.out.println(string);
//		System.out.println(string.charAt(3));
//		System.out.println(string.indexOf('u'));
//		char [] a=(string.toCharArray());
//		for (char c : a) {
//			System.out.println(c);
//			
//		}
		
		String name1=new String("citi");
		String name2="citi";
				System.out.println(name1==(name2));
				
	    StringBuilder builder=new StringBuilder("city 1");
	    System.out.println(builder);
	    
	    builder.append(",EON");
	    System.out.println(builder);
	    
	    try {
	    	Class class1=Class.forName("java.lang.String");
	    			System.out.println("name:"+class1.getCanonicalName());
	    			Constructor[] constructors=class1.getConstructors();
	    			for (Constructor constr:constructors)
	    			{
	    				
	    				Type [] types=constr.getGenericParameterTypes();
	    				for ( Type t : types) {
	    					System.out.print(t.getTypeName()+",");
	    				}
							System.out.println();
						
	    			}
	    }catch (ClassNotFoundException e) {
			// TODO: handle exception
	    	e.printStackTrace();
		}
		
		
	}

}
