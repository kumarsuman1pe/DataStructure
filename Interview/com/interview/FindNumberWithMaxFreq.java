package DataStructure.Interview.com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNumberWithMaxFreq {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1, 2, 3, 4, 3, 3, 2,2,2,2 );
		
		
	Map<Integer, Long> groupMap=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		//System.out.println(groupMap);
		Long maxval=Collections.max(groupMap.values());
		groupMap.forEach(
				(x,y)->{
					if(y==maxval)
					{
						System.out.println("Max freq key: "+ x + " value: "+y);
					}
				}
				);
	}
}
