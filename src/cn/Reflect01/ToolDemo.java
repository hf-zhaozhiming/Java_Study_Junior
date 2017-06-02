package cn.Reflect01;

public class ToolDemo {
	public static void main(String[] args) throws NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException {
		Dog s = new Dog();
		Tools t = new Tools();
		t.setProperties(s, "name", "уехЩ");
		System.out.println(s);
	}
}

class Dog {
	private String name;
	public int age;

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
