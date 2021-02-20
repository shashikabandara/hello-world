package q4;

public class MultiplyThread implements Runnable{
	private Object lock;
	private int start;
	private int range;
	public MultiplyThread(Object lock, int start, int range) {
		super();
		this.lock = lock;
		this.start = start;
		this.range = range;
		
	}
	
	public void MultiplyThread(Object lock, int start, int range) {
		synchronized(lock) {
			
			try {
				for(int i=start;i<=range;i++) {
					
					Thread.sleep(1);
					
					lock.notify();
					System.out.println("Thread 1=> "+i+"*"+i+"="+(i*i));
					lock.wait();
					
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		MultiplyThread(this.lock, this.start,this.range);
		
		
		
	}
}
