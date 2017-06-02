package cn.Reflect01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//ͨ��������ʳ�Ա����
public class ReflectDemo03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class c = Class.forName("cn.Reflect01.Student");
		// Method[] methods = c.getMethods();//��ӡ���༰�����е�public����
		Method[] methods = c.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m);
		}

		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		// �����޲η���
		Method meth = c.getMethod("getName");
		meth.invoke(obj);

		// ���ô��η���
		Method meth2 = c.getMethod("getName2", String.class);
		meth2.invoke(obj, "ս��");

		// ���ô������з���ֵ�ķ���
		Method meth3 = c.getMethod("getName3", String.class, int.class);
		Object reObj = meth3.invoke(obj, "����", 111);
		System.out.println(reObj);
	}

}
