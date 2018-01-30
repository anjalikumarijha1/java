package Day13;

public class Staticss {
	
	public int a= 10;
	public int b= 20;
	public static int c= 30;
	
	public  Staticss(){
		
		a++;
		b++;
		c++;
		System.out.println(a);		
		System.out.println(b);	
		System.out.println(c);	
		
	}
	
	public static void adds(){
		System.out.println(c+10);
	}

}
