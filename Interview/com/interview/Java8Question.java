package DataStructure.Interview.com.interview;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Java8Question {

public static void main(String [] args)
{
		Devloper dev = new Devloper("Navneet", Arrays.asList("JAVA","PHP"));

		Devloper dev1 = new Devloper("Abhishek", Arrays.asList("C","PYTHON"));

		Devloper dev2 = new Devloper("Raj", Arrays.asList("GO","C++"));

		Devloper dev3 = new Devloper("Ravi", Arrays.asList("JAVA","GO"));

		Devloper dev4 = new Devloper("Shakti", Arrays.asList("DATASTRUCTURE","PHP"));

		Devloper dev5 = new Devloper("Praveen", Arrays.asList("JAVA","C"));

 

 

		List<Devloper> list = Arrays.asList(dev, dev1, dev2, dev3, dev4, dev5);

		Map<Object, List<Object>> data = list.stream()
                .flatMap(devloper -> devloper.getSkils().stream()
                        .map(skill -> new AbstractMap.SimpleEntry<>(skill, devloper)))
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
 
		System.out.println(data);
}

}

//{JAVA=[Devlopers [name=Navneet, skils=JAVA], Devlopers [name=Ravi, skils=JAVA]], PHP=[Devlopers [name=Abhishek, skils=PHP], Devlopers [name=Shakti, skils=PHP]], ANGULAR=[Devlopers [name=Raj, skils=ANGULAR], Devlopers [name=Praveen, skils=ANGULAR]]}