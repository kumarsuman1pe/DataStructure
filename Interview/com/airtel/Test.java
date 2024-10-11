package DataStructure.Interview.com.airtel;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		String[] arr={ "123245", "USD", "HIC", "TD", "DTE", "2024/05/01", "9999/01/01", "SYNECH" };
		
	//[11:52 AM] Manoj Kumar7
	//	123245}USD}HIC}TD}DTE}2024/05/01}9999/01/01}SYNECH
		
		//Formatted String: 123245}USD}HIC}TD}DTE}2024/05/01}9999/01/01}SYNECH

		String output=Stream.of(arr).collect(Collectors.joining("}"));
		System.out.println("Formatted String: "+output);
	}

}
