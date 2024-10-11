package DataStructure.Interview.com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumberFromGivenArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("2");
		list.add("5");
		list.add("009");
		list.add("20");

//Collections.sort(list, (x,y)->{
//	String s1=((String) x).concat((String) y);
//	String s2=((String) y).concat((String) x);
//return -s1.compareTo(s2);
//	
//});
		int[] a = { 5,9,11,39,100 };
		StringBuffer sb = new StringBuffer();
		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				String s1 = String.valueOf(a[i]) + String.valueOf(a[j]);
				String s2 = String.valueOf(a[j]) + String.valueOf(a[i]);
				if (s1.compareTo(s2) < 1) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(" "+i);

		}
//System.out.println(list);
	}

}
