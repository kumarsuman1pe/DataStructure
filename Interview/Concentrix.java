package DataStructure.Interview;

import java.util.concurrent.atomic.AtomicInteger;

public class Concentrix {
    public static void main(String[] args) {
        sharedData data = new sharedData();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                data.updateAmount();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                data.withdrawAmount();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                data.withdrawAmount();
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}

class sharedData {
    private AtomicInteger amount = new AtomicInteger(0);
    private boolean ifAvailableForRead = false;

    public synchronized void updateAmount() {
        while (ifAvailableForRead) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        amount.addAndGet(1000);
        System.out.println("Amount updated: " + amount);
        ifAvailableForRead = true;
        notifyAll();
    }

    public synchronized void withdrawAmount() {
        while (!ifAvailableForRead) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        amount.addAndGet(-1000);
        System.out.println("Withdrawing amount... New amount: " + amount);
        ifAvailableForRead = false;
        notifyAll();
    }
}
