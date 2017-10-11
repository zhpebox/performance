import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {
	public static void main(String[] args) {
		// 创建MyCallable对象
		Callable<String> myCallable = new MyCallable();
		// 使用FutureTask来包装MyCallable对象
		FutureTask<String> ft = new FutureTask<String>(myCallable);
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i%71 == 0) {
//				System.out.println("创建线程"); 
				// 创建MyCallable对象
				myCallable = new MyCallable();
				// 使用FutureTask来包装MyCallable对象
				ft = new FutureTask<String>(myCallable);
				Thread thread = new Thread(ft);
				// FutureTask对象作为Thread对象的target创建新的线程
				thread.start();
				// 线程进入到就绪状态
			}
		}
		System.out.println("主线程for循环执行完毕..");
		try {
			String sum = ft.get();
			// 取得新创建的新线程中的call()方法返回的结果
			System.out.println("sum = " + sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}

}

class MyCallable implements Callable<String> {
	private int i = 0;

	// 与run()方法不同的是，call()方法具有返回值
	@Override
	public String call() {
//		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		int sum = 0;
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().toString() + " " + i);
			sum += i;
		}
		return String.valueOf(sum);
	}
}