package DataStructure.Interview.com.interview;

public class PubSubProgram {

	public static void main(String[] args) {
		SharedData sd = new SharedData();
		Publisher pubThread = new Publisher(sd);
		Subscriber subThread = new Subscriber(sd);

		pubThread.start();
		subThread.start();
	}
}

class SharedData {
	int data;
	boolean flag = true;

	public synchronized void setData(int data) throws InterruptedException {
		while (flag != true) {
			wait();
		}
		this.data = data;
		System.out.println("Publisher produced data: " + data);
		flag = false;
		notifyAll();
	}

	public synchronized void getData() throws InterruptedException {
		while (flag != false) {
			wait();
		}
		int val = data;
		System.out.println("Subscriber consuming data: " + val);
		flag = true;
		notify();
	}
}

class Publisher extends Thread {
	SharedData data;

	public Publisher(SharedData data) {
		this.data = data;
	}

	@Override
	public void run() {
		int n = 1;
		while (n <= 10) {
			try {
				data.setData(n++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class Subscriber extends Thread {
	SharedData data;

	public Subscriber(SharedData data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				data.getData();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
