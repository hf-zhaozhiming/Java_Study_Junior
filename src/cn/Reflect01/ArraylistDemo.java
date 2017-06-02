package cn.Reflect01;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * ��Arraylist<Integer> �����в���һ���ַ���
 */
public class ArraylistDemo {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(10);

		Class c = array.getClass();
		Method meth = c.getDeclaredMethod("add", Object.class);
		meth.invoke(array, "�ַ���");
		meth.invoke(array, "hello");

		array.add(886);
		System.out.println(array);
	}
}
