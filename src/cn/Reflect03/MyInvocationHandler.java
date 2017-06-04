package cn.Reflect03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object proxy;

	public MyInvocationHandler(Object obj) {
		proxy = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("权限校验");
		Object obj = method.invoke(this.proxy, args);
		System.out.println("日志记录");
		return obj;
	}

}
