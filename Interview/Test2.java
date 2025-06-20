package DataStructure.Interview;

public class Test2 {

	public static void main(String[] args) {
		
		//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
		// input: {0,1,2,1,0,2,0,1}, N=8
		//o/p: 0,0,0,1,1,1,2,2
		int []input= {0,1,2,1,0,2,0,1};
		int  n=8;
		int res[]=new int[n];
		int i=0,j=n-3;
		int count=0;
		while(i<n) {
			if(input[i]==0) {
				res[i]=0;
				count++;
				
			}
			if(input[i]==2) {
				res[j]=2;
				j--;
			}
			i++;
			
			
		}
		
//		for(int k=0;k<j;k++) {
//			if(input[k]==1) {
//				res[count]=1;
//			}
//		}
//		
		for(int l=0;l<n-1;l++) {
			System.out.print(res[l]);
		}
		
		
		
		
		
	}

}
