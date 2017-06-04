package cn.Reflect03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class UserDemo {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.find();

		// ʹ�ö�̬����ģʽʵ��
		InvocationHandler handler = new MyInvocationHandler(ud);
		UserDao p = (UserDao) Proxy.newProxyInstance(ud.getClass()
				.getClassLoader(), ud.getClass().getInterfaces(), handler);
		p.add();
		p.find();

	}
}
