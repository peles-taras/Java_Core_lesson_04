package ua.lviv.lgs2;

public class application {
	public static void main(String[] args) {
		Animal a = new Animal("�������", 20, 7);
		System.out.println("����� ������� = " + a.getName() + ", �������� ������� = " + a.getSpeed()
				+ "��/���, ³� ������� = " + a.getAge());

		a.setAge(14);
		a.setName("���");
		a.setSpeed(2);

		System.out.println("����� ������� = " + a.getName() + ", �������� ������� = " + a.getSpeed()
				+ "��/���, ³� ������� = " + a.getAge());
	}
}
