package cn.set4;

public class Student implements Comparable<Student> {
	private String name;
	private int chinese;
	private int math;
	private int english;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int chinaese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinaese;
		this.math = math;
		this.english = english;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChinaese() {
		return chinese;
	}

	public void setChinaese(int chinaese) {
		this.chinese = chinaese;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	@Override
	public int compareTo(Student o) {

		int result1 = this.chinese + this.english + this.math;
		int result2 = o.chinese + o.english + o.math;
		int result3 = result1 == result2 ? this.name.compareTo(o.name)
				: result1 - result2;
		return -result3;
	}

}
