package q4;

public class PlusThread implements Runnable{
	private Object lock;
	private int start;
	private int range;
	public PlusThread(Object lock, int start, int range) {
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;
		
	}
	
	public void addNumbers(Object lock, int start, int range) {
		synchronized(lock) {

			try {
				for(int i=start;i<=range;i++) {
					Thread.sleep(1);
					
					lock.wait();
					System.out.println("Thread 0=> "+i+"+"+i+"="+(i+i));
					lock.notify();
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	@Override
	public void run() {
		addNumbers(this.lock, this.start,this.range);
		
		
	}
}
