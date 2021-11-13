package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {

		Robot r = new Robot("� Robot � � ������ ������");
		System.out.println(r);

		CoffeeRobot cr = new CoffeeRobot("� CoffeRobot � � ���� ����");
		System.out.println(cr);

		RobotDancer rd = new RobotDancer("� RobotDancer � � ������ ������");
		System.out.println(rd);

		RobotCoocker rc = new RobotCoocker("� RobotCoocker � � ������ �����");
		System.out.println(rc);

//		BREAK
		System.out.println("");

		r.work();
		cr.work();
		rd.work();
		rc.work();

		Robot[] str = new Robot[] { r, cr, rd, rc };

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i].work());

		}

	}

}
