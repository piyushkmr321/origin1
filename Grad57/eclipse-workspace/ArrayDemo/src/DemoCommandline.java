
public class DemoCommandline {
public static void main(String[] args) {
	System.out.println("num of arguments="+args.length);
	System.out.println("args argument="+args[2]);
	
	int s=0;
	for (String x:args)
	{s=s+Integer.parseInt(x);
		
	}System.out.println(s);
}
}
