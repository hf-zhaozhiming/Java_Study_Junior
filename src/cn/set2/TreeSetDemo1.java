package cn.set2;

import java.util.TreeSet;

public class TreeSetDemo1 {

	/**
	 * ʹ�ñȽ�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TreeSet<Student> ts=new TreeSet<Student>();

		TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());

		Student s1 = new Student("s1", 1);
		Student s2 = new Student("s22", 2);
		Student s3 = new Student("s333", 3);
		Student s6 = new Student("s66", 6);
		Student s4 = new Student("s44", 4);
		Student s5 = new Student("s44", 4);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		for (Student s : ts) {
			System.out.println(s.getName() + "---------" + s.getAge());
		}
	}

}
