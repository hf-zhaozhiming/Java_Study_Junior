package cn.IO04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 1 创建学生对象，并实现自然排序功能
 * 2 创建treeset
 * 3 录入成绩排序
 * 4 遍历集合并写入文本
 */

public class StudentSortDemo {
	public static void main(String[] args) throws IOException {
		Student[] ss = new Student[5];
		for (int i = 0; i < 3; i++) {
			ss[i] = new Student();
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入姓名：");
			String name = sc.nextLine();
			ss[i].setName(name);
			System.out.println("请输入英语成绩：");
			ss[i].setChinese(sc.nextInt());
			System.out.println("请输入语文成绩：");
			ss[i].setEnglish(sc.nextInt());
			System.out.println("请输入数学成绩：");
			ss[i].setMath(sc.nextInt());
			System.out.println(ss[i].toString());
		}

		TreeSet<Student> ts = new TreeSet<Student>();
		for (int i = 0; i < 3; i++) {
			ts.add(ss[i]);
		}
		// Iterator<Student> itor = ts.iterator();
		// BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		// while (itor.hasNext()) {
		// bw.write(itor.next().toString());
		// bw.newLine();
		// bw.flush();
		// }
		// bw.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		for (Student s : ts) {
			bw.write(s.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
