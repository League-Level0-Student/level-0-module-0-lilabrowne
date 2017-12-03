import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint0 {
public static void main(String[] args) {
	String color =JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null, color + " is my favorite color too!");
	
	Robot c3po = new Robot (); 
	c3po.penDown();
	c3po.setRandomPenColor();
	c3po.setSpeed(10);
	c3po.turn(150);
	c3po.move(200);
	c3po.turn(120);
	c3po.move(200);
	c3po.turn(120);
	c3po.move(200);
}
}
