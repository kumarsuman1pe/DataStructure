package DataStructure.Java8;

import java.util.*;

public class StudentMarks2DArray {
    public static void main(String[] args) {
        String[][] marks={{"suman","2000"},{"Ashish","1000"},{"Aj","90"},{"suman","100"},{"arun","20"}};
        calculateHeighestAvgMarks(marks);
    }

    private static void calculateHeighestAvgMarks(String[][] marks) {
        Map<String, StringBuilder> marksMap = new HashMap<>();
        for (int i = 0; i < marks.length; i++) {
           if (marksMap.containsKey(marks[i][0])) {

               StringBuilder strings = marksMap.get(marks[i][0]).append(","+marks[i][1]);

               marksMap.put(marks[i][0],strings);
           }else {
               marksMap.put(marks[i][0],new StringBuilder(marks[i][1]));
           }
        }
        final long avg=0;
        List<Double> result=new ArrayList<>();
        marksMap.entrySet().stream().forEach(
                (e)->{
                    result.add(Arrays.stream(e.getValue().toString().split(",")).mapToInt(v->Integer.valueOf(v)).average().getAsDouble());
                }
        );
        System.out.println(result.stream().mapToDouble(e->e).max());
    }
}
