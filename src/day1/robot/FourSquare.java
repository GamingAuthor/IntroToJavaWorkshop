package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot roobit = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
roobit.setSpeed(100);
		// 5. Set the pen width to 5
roobit.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...

			// 7. Set the pen color to random

			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		int length = 200;
		roobit.penDown();
		roobit.setRandomPenColor();
		for(int bro = 0; bro < 4 ; bro++){
			roobit.move(length);
			roobit.turn(90);
			roobit.setRandomPenColor();
		}
		roobit.penUp();
		roobit.move(100);
		roobit.turn(90);
		roobit.move(100);
		roobit.turn(-90);

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
