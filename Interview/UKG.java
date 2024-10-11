package DataStructure.Interview;

import java.util.*;
import java.util.stream.Collectors;
public class UKG {
	
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        Integer[] array={36,54,75,36,28,15,11,75};
        Set<Integer> hs=new HashSet();
        
      List<Integer> res=  Arrays.stream(array).filter(e->!hs.add(e)).collect(Collectors.toList());
      
      
      System.out.print(res);
        
        
    }
}