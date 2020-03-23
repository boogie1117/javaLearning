import java.util.concurrent.locks.ReentrantLock;

public class Window implements Runnable{
	private int ticket=100;

	ReentrantLock lock=new ReentrantLock(true);

	@Override
	public void run() {
		while(true) {
			
			
				synchronized (this) {
					notify();//唤醒wait进程
					if(ticket>0) {
						System.out.println(Thread.currentThread().getName()+"票号为"+ticket);
						ticket--;
						try {
							wait();//阻塞现有进程，并释放锁
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						}else break;
				}
					
						
				
			
			
	}}
	
}
