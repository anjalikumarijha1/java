package Day13;

public class Checkedexp {
	
	public int div(int a, int b) throws Exception{
		int c=0;
		
		if(b==0){
			throw new Exception("Oh my god you are dividing by zero");
		}else{
			c=a/b;
		}
		
		
		
		return c;
		
		
		
	}

}
