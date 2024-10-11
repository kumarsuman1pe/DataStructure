package DataStructure.Interview.com.airtel;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Airtel {

	public static void main(String[] args) {
		int input[]= {1,2,3,4,5,6,7,8,9};
		int key = 4;
		
		findKeyAndSwap(input,key);
	}

	private static void findKeyAndSwap(int[] input,int key) {
		int temp=0;
		int temp1=0;
		int size=input.length-1;
		for(int i=0;i<input.length-1;i++) {
			
			if(input[i]!=key) {
				continue;
			}else if(input[i]==key) {
				temp=i;
			}
			
		}
		temp1=temp;
		for(int i=0;i<temp1;i++) {
			swap(input,i,temp1);
			temp1--;
		}
		
		for(int i=temp;i<size;i++) {
			
			swap(input,i,size);
			size--;
		}
		IntStream.of(input).forEach(System.out::print);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
