package cn.IO04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 1 ����ѧ�����󣬲�ʵ����Ȼ������
 * 2 ����treeset
 * 3 ¼��ɼ�����
 * 4 �������ϲ�д���ı�
 */

public class StudentSortDemo {
	public static void main(String[] args) throws IOException {
		Student[] ss = new Student[5];
		for (int i = 0; i < 3; i++) {
			ss[i] = new Student();
			Scanner sc = new Scanner(System.in);
			System.out.println("������������");
			String name = sc.nextLine();
			ss[i].setName(name);
			System.out.println("������Ӣ��ɼ���");
			ss[i].setChinese(sc.nextInt());
			System.out.println("���������ĳɼ���");
			ss[i].setEnglish(sc.nextInt());
			System.out.println("��������ѧ�ɼ���");
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
