import java.util.ArrayList;
import java.util.List;

public class Tavant {

	public static void main(String[] args) {
//		String[] input= {"java","abcd","avaj","bcda","aavj"};
//		//java,avaj,aavj
//		//abcd,bcda
//		Set<String> hs=new HashSet<>();
//		//aajv
//		Stream.of(input).sorted().forEach(e->hs.add(e));
//		
//		System.out.println("..");
		List<Object> objeList=new ArrayList<Object>();
		
		for(int i=0;i<6;i++) {
			objeList.add(Singleton.getSoleInstance());
		}
		
		objeList.forEach(e->{
			System.out.println(e.hashCode());
		});
		
		
	}

}

class Singleton{
	private Singleton() {}
	
	private static Singleton soleInstance=null;
	private static  int maxCount=5;
	private static int currentCount=0;
	
	public static Singleton getSoleInstance() {
		if(soleInstance==null || currentCount<maxCount)
		{
			synchronized (Singleton.class) {
				if(soleInstance==null || currentCount<maxCount)
				{
				soleInstance = new Singleton();
				currentCount++;
				}
			}
		
		}
		return soleInstance;
		
	}
	
}






