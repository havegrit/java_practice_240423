package oop16;

public class ThreadTest extends Thread {
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		t.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("main: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("main 종료");
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("run: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("run 종료");
	}
}
