package cn.Reflect01;

import java.lang.reflect.Field;

/*
 * 使用反射实现一个通用函数，实现对某对象某属性的赋值操作，忽略访问控制策略
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
