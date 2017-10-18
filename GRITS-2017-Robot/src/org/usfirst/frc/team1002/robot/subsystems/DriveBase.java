package org.usfirst.frc.team1002.robot.subsystems;

import org.usfirst.frc.team1002.robot.*;

import org.usfirst.frc.team1002.robot.RobotMap;
import org.usfirst.frc.team1002.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveBase extends Subsystem {
	private RobotDrive theDrive = new RobotDrive(RobotMap.frontLeftMotor, RobotMap.BackLeftMotor, RobotMap.frontRightMotor, RobotMap.BackLeftMotor);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
       setDefaultCommand(new DriveCommand());
    }
    
    public void roboDrive(double leftSpeed, double rightSpeed, double angle) {
    	theDrive.mecanumDrive_Cartesian(leftSpeed, rightSpeed, angle, 0);
    }
    
    public void setRightMotors(double speed) {
    	
    }
}

