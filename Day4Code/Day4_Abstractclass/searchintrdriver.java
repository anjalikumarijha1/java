package Day4Code.Day4_Abstractclass;
public class searchintrdriver {
	
	
	public static void main(String[] args) {
		
//		RamYahooSearch ys = new RamYahooSearch();
//		ys.openApp("https://search.yahoo.com/");
//		System.out.println(ys.extractresult("selenium"));
//		ys.Close();
//		
//		
//		
//		ShyamBing bg = new ShyamBing();
//		bg.openApp("http://www.bing.com/");
//		System.out.println(bg.extractresult("selenium"));
//		bg.Close();
		
//		String engine = "yahoo";
//		Searchinter in ;
//		
//		
//		if(engine.equals("yahoo")){
//			in = new RamYahooSearch();
//			in.openApp("https://search.yahoo.com/");
//			
//		}else if(engine.equals("bing")){
//			
//			in = new ShyamBing();
//			in.openApp("http://www.bing.com/");
//
//		}
//		
//		System.out.println(in.extractresult("selenium"));
//		in.Close();
//		
		
		
		
		String engine = "yahoo";
			
		
		
		if(engine.equals("yahoo")){
			RamYahooSearch in = new RamYahooSearch();
			in.openApp("https://search.yahoo.com/");
			System.out.println(in.extractresult("selenium"));
			in.Close();
			
		}else if(engine.equals("bing")){
			
			ShyamBing in = new ShyamBing();
			in.openApp("http://www.bing.com/");
			System.out.println(in.extractresult("selenium"));
			in.Close();

		}
		
		
		
		
		
		
		
		
		
	}

}
