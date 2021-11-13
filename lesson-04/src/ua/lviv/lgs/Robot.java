package ua.lviv.lgs;

public class Robot {

	private String imRobot;

	Robot(String imRobot) {
		this.imRobot = imRobot;
	}

	public String work() {
		return imRobot;

	}

	public String getImRobot() {
		return imRobot;
	}

	public void setImRobot(String imRobot) {
		this.imRobot = imRobot;
	}

	@Override
	public String toString() {
		return "[" + work() + "]";
	}
}
