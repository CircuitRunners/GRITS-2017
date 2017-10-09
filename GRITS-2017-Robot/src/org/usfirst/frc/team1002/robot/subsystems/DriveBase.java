package org.usfirst.frc.team1002.robot.subsystems;

import org.usfirst.frc.team1002.robot.*;

import org.usfirst.frc.team1002.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveBase extends Subsystem {
	private VictorSP frontLeftMotor = new VictorSP(RobotMap.frontLeftMotor);
	private VictorSP frontRightMotor = new VictorSP(RobotMap.frontRightMotor);
	private VictorSP backLeftMotor = new VictorSP(RobotMap.BackLeftMotor);
	private VictorSP backRightMotor = new VictorSP(RobotMap.BackRightMotor);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        frontLeftMotor.set(0);
        frontRightMotor.set(0);
        backLeftMotor.set(0);
        backRightMotor.set(0);
    }
    
    public void tankDrive(double leftSpeed, double rightSpeed) {
    	frontLeftMotor.set(leftSpeed);
    	backLeftMotor.set(leftSpeed);
    	frontRightMotor.set(rightSpeed);
    	backRightMotor.set(rightSpeed);
    }
    
    public void setRightMotors(double speed) {
    	frontRightMotor.set(speed);
    	backRightMotor.set(speed);
    }
}

