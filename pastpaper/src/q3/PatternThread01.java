package q3;

import java.util.concurrent.locks.Lock;

public class PatternThread01 extends Thread {
 
	String textilePattern;
	int width;
	int count;
	String lock;
	public PatternThread01(String lock2,String textilePattern, int width, int count) {
		super();
		this.lock=lock2;
		this.textilePattern = textilePattern;
		this.width = width;
		this.count = count;
	}
	
	public void run(){
			synchronized(lock) {
				try {
					for(int i=0;i<this.count;i++) {
						sleep(1);
						System.out.print("Pattern 01 Thread = ");
						for(int j=0;j<this.width;j++) {
							System.out.print(this.textilePattern);
						}
						lock.wait();
						
						lock.notify();
						
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
	}
	
	
}
