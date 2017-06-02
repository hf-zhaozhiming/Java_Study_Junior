package cn.Reflect01;

public class Student {
	private String name;
	private int age;
	public String addr;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	Student(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	public Student(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	private Student(String name) {
		super();
		this.name = name;
	}

	public void getName() {
		System.out.println("getName function!");
	}

	public void getName2(String name) {
		System.out.println("getName function!" + name);
	}

	public String getName3(String name, int num) {
		System.out.println("getName function3!" + name + num);
		return "込込込込込��";
	}

	public void setName(String name) {
		this.name = name;
	}

	private int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr
				+ "]";
	}

}
