package thread;

public class ProblemOfThread {

	public static int money = 0;

	public static void main(String[] args) throws InterruptedException {
		Runnable task1 = () -> {
			for (int i = 0; i < 10000; i++) {
				money++;
			}
		};

		Runnable task2 = () -> {
			for (int i = 0; i < 10000; i++) {
				money--;
			}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		//join() : 해당 쓰레드가 끝날 때까지 현재 쓰레드를 기다리게 하는 것
		t1.join(); 
		t2.join();
		
		System.out.println(money);
		
	}

}
