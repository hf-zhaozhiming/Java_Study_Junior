package cn.Pattern01;

/*
 * 工厂模式！
 */
public class AnimalDemo {
	public static void main(String[] args) {
		Factory f = new DogFactory();
		Animal a = f.createAnimal();
		a.eat();

		f = new CatFactory();
		a = f.createAnimal();
		a.eat();
	}
}
