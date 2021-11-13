package ua.lviv.lgs2;

public class application {
	public static void main(String[] args) {
		Animal a = new Animal("Леопард", 20, 7);
		System.out.println("Назва тварини = " + a.getName() + ", Швидкість тварини = " + a.getSpeed()
				+ "км/год, Вік тварини = " + a.getAge());

		a.setAge(14);
		a.setName("Бик");
		a.setSpeed(2);

		System.out.println("Назва тварини = " + a.getName() + ", Швидкість тварини = " + a.getSpeed()
				+ "км/год, Вік тварини = " + a.getAge());
	}
}
