package cn.Thread03;

public class Student {
	private String name;
	private int age;
	private boolean flag = false;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, boolean flag) {
		super();
		this.name = name;
		this.age = age;
		this.flag = flag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
