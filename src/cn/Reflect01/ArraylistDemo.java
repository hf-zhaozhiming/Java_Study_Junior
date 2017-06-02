package cn.Reflect01;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 往Arraylist<Integer> 集合中插入一个字符串
 */
public class ArraylistDemo {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(10);

		Class c = array.getClass();
		Method meth = c.getDeclaredMethod("add", Object.class);
		meth.invoke(array, "字符串");
		meth.invoke(array, "hello");

		array.add(886);
		System.out.println(array);
	}
}
