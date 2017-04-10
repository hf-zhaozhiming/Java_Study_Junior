package cn.set;

import java.util.HashSet;
import java.util.Set;

import cn.zhaozm01.Student;

public class SetDemo2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		Student s1 = new Student("test1", 11);
		Student s2 = new Student("etset", 12);
	}
}
