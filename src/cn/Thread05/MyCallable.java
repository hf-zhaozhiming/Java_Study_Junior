package cn.Thread05;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
	private int num;
	private int sum;

	public MyCallable(int num) {
		super();
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

}
