package DataStructure.Interview.com.amazon;


public class EvenOdd {

	public static void main(String[] args) {
		Print p=new Print();
		
		

		Thread evenThread=new Thread(()-> {
		    
			while(true) {
			try {
				p.printEven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}
			);
			
		
		Thread oddThread=new Thread(()-> {
			while(true) {
			try {
				p.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}
			);
		
		evenThread.start();
		oddThread.start();
	}

}

class Print{
	boolean flag=false;
	volatile int number=1;
	
	
	public synchronized void printEven() throws InterruptedException {
		while(!flag) {
			wait();
		}
		if(number%2==0 && number<=10 ) {
			System.out.println("Even "+number);
			number++;
			
		}
			flag=false;
		notify();
	}
	
	
	public synchronized void printOdd() throws InterruptedException {
		while(flag) {
			wait();
		}
		if(number%2!=0 && number<=10) {
			System.out.println("Odd "+number);
			number++;
		}
		flag=true;
		notify();
	}

}