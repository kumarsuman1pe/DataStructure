import java.util.stream.Stream;

public class Epam {

	
	
	
//	output:
//	[epam, pame, aepm] contains same character
//	[java, ajav] contains same character
//	[abcd, dcba] contains same character
	
	public static void main(String[] args) {
		String arr[] = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };
		
	Stream.of(arr).forEach(e->{
		String s=Stream.of(e).sorted().toString();
	});
	
	


	}

}




Class Employee{
	
	
	
	@ManyToMany
	(Jointable="" @joinColumn()
	Course course;
	
}





















