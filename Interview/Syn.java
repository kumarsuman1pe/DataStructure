import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Syn {
	public static void main(String[] args)
	{
//		Find highest avg score.
//        String[][] scores = { { "Bunney", "81" }, { "Charles", "20" }, { "Remo", "87" }, 
		//{ "Charles", "100" },{ "Bunney", "99" } };
//         // Bunney’s average - 90, Charles’ average is = 60, Remo = 87
//          //90 is the highest average score
//        Scores can be positive/negative integer
//       If you get non-integer(means decimal number) use Math floor function

		String[][] scores = { { "Bunney", "81" }, { "Charles", "20" }, { "Remo", "87" }, 
				{ "Charles", "100" },{ "Bunney", "99" } };
		
		Map<String,List<String>> studentMap=new HashMap<>();
		for(int i=0;i<scores[0].length;i++) {
			if(studentMap.containsKey(scores[i][0]))
			{

				List<String> marks = studentMap.get(scores[i][0]);
				marks.add(scores[i][1]);

				marks = studentMap.put(scores[i][0], marks);
			}else {
				studentMap.put(scores[i][0], List.of(scores[i][1]));
		
			
		}
			
			 Collection<List<String>> marks = studentMap.values();
			 
			 for (Iterator iterator = marks.iterator(); iterator.hasNext();) {
				List<String> list = (List<String>) iterator.next();
				
				
				
			}
		

		
		
	}

}
