
public class Productor_CosumerTest {
		public static void main(String[] args) {
			clerk c=new clerk();
			Consumer c1=new Consumer(c);
			Productor p1= new Productor(c);
			c1.setName("消费者1");
			p1.setName("生产者1");
			c1.start();
			p1.start();
		}
		
		
}
class Consumer extends Thread{
	private clerk c;
	public  Consumer(clerk c) {
		this.c=c;
	}
	@Override
	public void run() {
		while(true) {
			c.consume();
		}
	}
}
class Productor extends Thread{
	  private clerk c;
		public Productor(clerk c) {
			this.c=c;
		}
		@Override
		public void run() {
			while(true) {
				
					c.produce();
			}
		}
}
class clerk{
	private int productnum=0;
	
	public synchronized void produce() {
		if(productnum<20) {
			productnum++;
			System.out.println(Thread.currentThread().getName()+"生产第"+productnum+"个产品");
			notify();
		}else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
	
	public synchronized void consume() {
		if(productnum>0) {
			System.out.println(Thread.currentThread().getName()+"消费第"+productnum+"个产品");
			productnum--;
			notify();
		}else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}