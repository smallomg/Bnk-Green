package thread;

public class MyRunnable implements Runnable {
	//스레드를 만드는 방법 2가지
	// Runnable 인터페이스 받는다
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
