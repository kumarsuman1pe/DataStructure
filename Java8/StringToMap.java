package DataStructure.Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToMap {
    public static void main(String[] args) {
        String s="suman:31,deepak:33,arun:35,deepak:51";

     Map<String,Integer> studentMap=  Stream.of(s.split(",")).collect(Collectors.toMap(e->e.split(":")[0],e-> Integer.parseInt(e.split(":")[1]),(x,y)->x+y, TreeMap::new));
    studentMap.entrySet().stream().forEach((k)->{
        System.out.println(k.getKey()+":"+k.getValue());

    });
    studentMap.forEach((k,v)->System.out.println(k+":"+v));
    System.out.println("studentMap: ");
    System.out.println(studentMap);
    }
}
