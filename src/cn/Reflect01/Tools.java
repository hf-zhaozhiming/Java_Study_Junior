package cn.Reflect01;

import java.lang.reflect.Field;

/*
 * ʹ�÷���ʵ��һ��ͨ�ú�����ʵ�ֶ�ĳ����ĳ���Եĸ�ֵ���������Է��ʿ��Ʋ���
 */
public class Tools {
	public void setProperties(Object obj, String property, Object value)
			throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {
		Class c = obj.getClass();
		Field field = c.getDeclaredField(property);
		field.setAccessible(true);
		field.set(obj, value);
	}
}
