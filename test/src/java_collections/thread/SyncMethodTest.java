package thread;

public class SyncMethodTest {

	public static int money = 0;

	public static void main(String[] args) throws InterruptedException {

		Runnable task1 = () -> {
			for (int i = 0; i < 10000; i++) {
				deposit();
			}
		};

		Runnable task2 = () -> {
			for (int i = 0; i < 10000; i++) {
				withdraw();
			}
		};

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(money);

	}

	// synchronized 동기화 : 여러 쓰레드가 동시에 공유 자원에 접근하지 못하게 막는 잠금 장치
	// 동기 메소드 : 순서대로 실행되는 함수
	// 비동기 메소드 : 순서상관없이 스레드와 기다리기도 전에 그냥 실행되는 함수
	public synchronized static void deposit() {
		money++;
	}

	public synchronized static void withdraw() {
		money--;
	}

}
