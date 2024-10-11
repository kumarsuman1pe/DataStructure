package DataStructure.Interview.com.airtel;

import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
// [11:56 AM] Manoj Kumar7
		// Input: nums = [1,1,1,2,2,3]
		// [11:57 AM] Manoj Kumar7
		// remove some duplicates in-place such that each unique element appears at most
		// twice.
		
		int nums[] = {1,1,1,1,2,2,3};
		// output: 1,1,2,2,3,1
		int length=nums.length-1;
		for(int i=0;i<length;i++) {
			int count=0;
			while(i< length && nums[i]==nums[i+1]) {
				if(count==2) {break;}
				i++;
				count++;
				
			}
			
			if(i< length && nums[i-1]==nums[i]) {
				while(i< length) {
				nums[i]=nums[i+1];
				i++;
			}
			
			}
		}
		for(int num:nums) {
			System.out.println(num);
		}

	}

}
