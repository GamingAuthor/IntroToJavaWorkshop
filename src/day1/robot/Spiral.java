package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot bobert = new Robot();
		// 5. Set your robot's pen to the down position
bobert.penDown();
		// 3. Set the robot to go at max speed (10)
bobert.setSpeed(10);
		// 4. Do the following (steps 6-9) 75 times
for(int bruh = 0; bruh<75; bruh++){
			// 7. Change the pen color to random
bobert.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
bobert.move(5*bruh);
			// 2. Turn the robot 1/3 of 360 degrees to the right
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
bobert.turn(360/3);
			// 9. Set the pen width to i
bobert.setPenWidth(bruh);
}
	}
}
