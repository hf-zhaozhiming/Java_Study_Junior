package cn.Reflect01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//通过反射访问成员方法
public class ReflectDemo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class c = Class.forName("cn.Reflect01.Student");
		// Method[] methods = c.getMethods();//打印该类及父类中的public方法
		Method[] methods = c.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m);
		}

		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		// 调用无参方法
		Method meth = c.getMethod("getName");
		meth.invoke(obj);

		// 调用带参方法
		Method meth2 = c.getMethod("getName2", String.class);
		meth2.invoke(obj, "战三");

		// 调用带参且有返回值的方法
		Method meth3 = c.getMethod("getName3", String.class, int.class);
		Object reObj = meth3.invoke(obj, "李四", 111);
		System.out.println(reObj);
	}

}
