package DataStructure.Interview.com.interview;

public class Test {

	public static void main(String[] args) {
		String input="Received $40,000 from X5 consulting. Credited Rs2,95,0000 in bank.";
		
		calculateConversionRate(input);

	
	}

	private static void calculateConversionRate(String input) {
		
		String s1=input.substring(input.indexOf("$"));
		
		String s2=s1.substring(1,input.indexOf(" ") );
		System.out.println(s2);
		
		String r1=input.substring(input.indexOf("Rs"));
		
		String r2=r1.substring(2,r1.indexOf(" "));
		System.out.println(r2);
		String t1=r2.replace(",", "").trim();
		String t2=s2.replace(",", "").trim();
		Double rate=Double.valueOf(t1)/Long.valueOf(t2);
		System.out.println(rate);
		
		
	
	}
}
