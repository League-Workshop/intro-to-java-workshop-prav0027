package section2;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot arnold=new Robot();
arnold.setPenWidth(15);
arnold.setPenColor(59, 255, 237);
arnold.penDown();
arnold.move(100);
arnold.turn(90);
arnold.move(100);
arnold.turn(90);
arnold.move(100);
arnold.turn(90);
arnold.move(100);
	}
}
