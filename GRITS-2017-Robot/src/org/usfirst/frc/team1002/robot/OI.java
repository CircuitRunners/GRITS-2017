package org.usfirst.frc.team1002.robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRiGGERiNG COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	private XboxController xbox = new XboxController(0);
	

	public double getLeftStickX() {
		return deadzone(xbox.getX(Hand.kLeft)); 
	}
	
	public double getLeftStickY() {
		return deadzone(xbox.getY(Hand.kLeft)); 
	}
	
	public double getRightStickX() {
		return deadzone(xbox.getX(Hand.kRight)); 
	}
	
	public double getRightStickY() {
		return deadzone(xbox.getY(Hand.kRight)); 
	}
	
	public void drive() {
		if (getLeftStickX() != 0 || getLeftStickY() != 0 || getRightStickX() != 0) {
			;
		}
	}
	
	private static double deadzone(double value) {
		if (value > 0.9) 
			return 1;
		else if (value < 0.1 && value > -0.1) 
			return 0;
		else if (value < -0.9) 
			return -1;
		else 
			return Math.sin(value);
	}
}
