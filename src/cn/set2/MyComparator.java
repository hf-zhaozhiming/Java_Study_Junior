package cn.set2;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		// 比主要字段 姓名长度
		int num = o1.getName().length() - o2.getName().length();
		// 比次要字段 姓名大小
		int num2 = (num == 0 ? o1.getName().compareTo(o2.getName()) : num);
		// 比次要字段 姓名大小
		int num3 = (num2 == 0 ? o1.getAge() - o2.getAge() : num2);

		return num3;
	}
}
