package DataStructure.Interview.com.interview;

import java.util.HashSet;
import java.util.Set;

public class ICE {

	public static void main(String[] args) {
		int duplicateEle[]= {1,2,2,2,8,10};
		Set<Integer> unique=findDuplicate(duplicateEle);
		if(duplicateEle.length<unique.size()) {
			
		}
		
		int uniqueList[]= {1,2,6,5,8,10};
		Set<Integer>uniqueOutput=findDuplicate(uniqueList);
		if(uniqueList.length==uniqueOutput.size()) {
			
		}
		
		
//		1.empty list
//		2.null value
//		3.{-1,2,6,5,8,10};
//		{-1,Null,6,5,8,10};
//		{"",}
//		{10,,6,5,1,0};
//		{0,0,0,0,0};
//		{-1,-1}
//		{}
	}
	
	public static Set<Integer> findDuplicate(int []input) {

		int a[]= {1,2,2,5,8,10};
		//op:1,2,5,8,10
		Set<Integer> hs=new HashSet();
		for (int i = 0; i < a.length; i++) {
			if(!hs.add(a[i])) {
				System.out.println("Duplicate ele "+a[i]);
			}
		}
		System.out.println(hs);
	
		return hs;
	}

}
