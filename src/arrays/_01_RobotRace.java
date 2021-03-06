package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	static int x = 100;
	static int y = 600;

	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX(x);
			robots[i].setY(y);
			robots[i].setSpeed(100);
			x += 100;
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean isRunning = true;
		while (isRunning) {
			for (int j = 0; j < robots.length; j++) {
				Random rand = new Random();
				int randint = rand.nextInt(50);
				robots[j].move(randint);

				if (robots[j].getY() < 0) {
					isRunning = false;
					winner(robots[j], j);
					break;
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}

	private static void winner(Robot robot, int winningrobot) {
		// TODO Auto-generated method stub
		System.out.println("yay a robot won!");
		System.out.println("*throws party for robot " + (winningrobot+1) + "*");
	}

}
