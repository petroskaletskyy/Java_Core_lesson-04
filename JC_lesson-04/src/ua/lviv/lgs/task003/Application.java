package ua.lviv.lgs.task003;

public class Application {

	public static void main(String[] args) {
		
		Animal animal = new Animal("�������", 20, 7);
		System.out.println(animal);
		System.out.println("----------------------------");
		animal.setName("���");
		animal.setSpeed(2);
		animal.setAge(14);
		System.out.println(animal);
	}

}
