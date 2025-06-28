package DataStructure.Java8;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortByMapValue {
    public static void main( String[] args ) {
        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();
        capitals.put( "Nepal", "Kathmandu" );
        capitals.put( "India", "New Delhi" );
        capitals.put( "United States", "Washington" );
        capitals.put( "England", "London" );
        capitals.put( "Australia", "Canberra" );
        List<String> sortedCpitals = capitals.entrySet().stream().map( Map.Entry::getValue ).sorted( Comparator.reverseOrder() ).toList();
        System.out.println( "Sorted Value: " + sortedCpitals );
        //altr
        List<String> sortedCpitals1=capitals.entrySet().stream().sorted(Map.Entry.<String,String>comparingByValue().reversed()).map( Map.Entry::getValue ).toList();
        System.out.println( "Sorted Value: " + sortedCpitals1 );
    }
}
