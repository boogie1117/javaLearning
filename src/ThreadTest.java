
public class ThreadTest {

	public static void main(String[] args) {
		Window w=new Window();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		
		t1.setName("线程1");
		t2.setName("线程2");
		t3.setName("线程3");
		
		t1.start();
		System.out.println("线程1开始执行");
		t2.start();
		System.out.println("线程2开始执行");
		t3.start();
		System.out.println("线程3开始执行");
		
		
	}

}
