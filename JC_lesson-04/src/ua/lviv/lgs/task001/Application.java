package ua.lviv.lgs.task001;

public class Application {

	public static void main(String[] args) {

		Robot robot = new Robot("Robot", "������ ������");
		robot.work();
		CoffeRobot coffeRobot = new CoffeRobot("CoffeRobot", "���� ����");
		coffeRobot.work();
		RobotDancer robotDancer = new RobotDancer("RobotDancer", "������ ������");
		robotDancer.work();
		RobotCoocker robotCoocker = new RobotCoocker("RobotCoocker", "������ �����");
		robotCoocker.work();

		System.out.println("");
		System.out.println("-----------------Class array------------------------");
		System.out.println("");

		Robot[] robots = new Robot[4];

		robots[0] = new Robot("Robot", "������ ������");
		robots[1] = new CoffeRobot("CoffeRobot", "���� ����");
		robots[2] = new RobotDancer("RobotDancer", "������ ������");
		robots[3] = new RobotCoocker("RobotCoocker", "������ �����");

		for (int i = 0; i <= 3; i++) {
			robots[i].work();
		}
	}

}
