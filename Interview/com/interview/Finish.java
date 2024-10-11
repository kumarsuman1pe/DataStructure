package DataStructure.Interview.com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Finish {	
	public static void main(String[] args) {
		String in="java is a popular language";
		
	Stream<String> s=Stream.of(in);
	//int count=s.collect(Collectors.groupingBy(String));
	
		
		
		
		
		
		
		
		
		
		
		
//		List<Integer> list= List.of(1,2,3,4,5,6,8);
//		
//		
//		Thread t1=new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for(int i=0;i<list.size();i++) {
//					if(list.get(i)%2==0) {
//						System.out.println("By thread 1 .."+list.get(i));
//					}
//				}
//				
//			}
//		});
//Thread t2=new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for(int i=0;i<list.size();i++) {
//					if(list.get(i)%2!=0) {
//						System.out.println("By thread 2 .."+list.get(i));
//					}
//				}
//				
//			}
//		});
//		
//		t1.start();
//		t2.start();
	}
}
	
	
	
	
	
	
	

//	public static void main(String[] args) {
//		String input ="a,bx,$!,M,@K,R,T,Y";
//		//output:- "Y,TR,$!,K,@M,x,b,a";
//System.out.println(reverString(input.toUpperCase()));
//		
//	}

//	private static String reverString(String input) {
//		
//		int start=0;
//		int end=input.length()-1;
//		while(start<end) {
//			while(start<end &&!(input.charAt(start) >= 65 && input.charAt(start)>=91)) {
//				start++;
//			}
//			while(end>start && (!(input.charAt(end) >= 65 && input.charAt(end)>=91))) {
//				end--;
//			}
//			swap(input,start,end);
//			
//		}
//		
//		return null;
//	}

//	private static String swap(String input, int start, int end) {
//		char temp=input.charAt(start);
//		char temp1=input.charAt(end);
//		
//		char[] a=input.toCharArray();
//		a[end]=temp;
//		a[start]=temp1;
//		
//		
//		return a.toString();
	//}

//}
