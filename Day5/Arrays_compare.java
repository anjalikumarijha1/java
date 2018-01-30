package Day5;

public class Arrays_compare {
	
	public static void main(String[] args) {
//		objective: to find the value in Array1 not present in Array2
		String[] Array1 = new String[5];
		String[] Array2 = new String[5];
		
		Array1[0]="orange";
		Array1[1]="mango";
		Array1[2]="pineapple";
		Array1[3]="apple";
		Array1[4]="banana";

		Array2[0]="orange";
		Array2[1]="kiwi";
		Array2[2]="pineapple";
		Array2[3]="grapes";
		Array2[4]="banana";
		
//		iterate through the first Array1
		for(int i = 0 ; i<Array1.length ;i++ ){
			boolean flag = false;
//			iterate through the second Array2
			for(int j = 0 ; j<Array2.length ;j++ ){
			
				if(Array1[i].equals(Array2[j])){	
					flag=true;
					break;					
				}			
			}	//Array2	
//			check condition
			if(flag==false){
				System.out.println(Array1[i]);
			}
		} //Array1
		
		
		
		
		
		
		
		
	}
}
