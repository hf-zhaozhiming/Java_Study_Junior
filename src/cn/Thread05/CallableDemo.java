package cn.Thread05;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Future<Integer> t1 = pool.submit(new MyCallable(100));
		Future<Integer> t2 = pool.submit(new MyCallable(200));
		int result1 = t1.get();
		int result2 = t2.get();
		System.out.println(result1 + "----" + result2);
		pool.shutdown();

	}
}
