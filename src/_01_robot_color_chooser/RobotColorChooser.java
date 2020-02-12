//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
	for (int i = 0; i < 9000; i++) {
		
	
		//1. Create a new Robot
		Robot IceCream = new Robot("mini");
		//3. Ask the user what color they would like the robot to draw
String colors=JOptionPane.showInputDialog(null, "What color would you like the robot to draw");
		//5. Use an if/else statement to set the pen color that the user requested
if (colors.equalsIgnoreCase("Pink")) {
	IceCream.setPenColor(Color.pink);
} else if(colors.equalsIgnoreCase("Cyan")) {
	IceCream.setPenColor(Color.cyan);

} else if(colors.equalsIgnoreCase("ornage")) {
	IceCream.setPenColor(Color.ORANGE);
}else if(colors.equalsIgnoreCase("Magenta")) {
	IceCream.setPenColor(Color.MAGENTA);
}else {
IceCream.setRandomPenColor();
	
}
//6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		IceCream.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		IceCream.penDown();
		IceCream.setSpeed(50);
		IceCream.move(200);
		IceCream.turn(-90);
		IceCream.move(200);
		IceCream.turn(-90);
		IceCream.move(200);
		IceCream.turn(-90);
		IceCream.move(200);
		IceCream.turn(-90);
	}
	}
}
