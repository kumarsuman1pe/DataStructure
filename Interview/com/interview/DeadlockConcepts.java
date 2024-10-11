package DataStructure.Interview.com.interview;

public class DeadlockConcepts {
	public static String obj1 = "Suman";
	public static String obj2 = "Kumar";

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			synchronized (obj1) {
				System.out.println(Thread.currentThread().getName() + " got lock on Obj1");

				synchronized (obj2) {
					System.out.println(Thread.currentThread().getName() + " got lock on Obj2");

				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (obj2) {
				System.out.println(Thread.currentThread().getName() + " got lock on Obj2");
				synchronized (obj1) {
					System.out.println(Thread.currentThread().getName() + " got lock on Obj1");

				}
			}
		});
		
		t1.start();
		t2.start();
	}
}