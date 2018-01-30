package Day13;

public class Exceptionhandli {
	
	public static void main(String[] args) {
		
		int a = 4;
		int b=0;
		int c=0;
		
		try{
		c=a/b;
		}catch(NullPointerException e){
			System.out.println("hello" + e.toString());
		}
		catch(ArithmeticException e){
				System.out.println("hola" + e.toString());
		}catch(Exception e){		
			
			System.out.println(e.toString());			
		}finally{
			System.out.println("almost done");
		}
		
		System.out.println(c);
		System.out.println(a+b);
		
		
		
		
		
		
		
	}
}
