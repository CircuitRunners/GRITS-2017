package org.usfirst.frc.team1002.robot.subsystems;

import org.usfirst.frc.team1002.robot.*;

import org.usfirst.frc.team1002.robot.RobotMap;
import org.usfirst.frc.team1002.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveBase extends Subsystem {
	VictorSP frontLeftController = new VictorSP(RobotMap.frontLeftMotor);
	VictorSP frontRightController = new VictorSP(RobotMap.frontRightMotor);
	VictorSP backLeftController = new VictorSP(RobotMap.BackLeftMotor);
	VictorSP backRightController = new VictorSP(RobotMap.BackRightMotor);
	private RobotDrive robotDrive = new RobotDrive(frontLeftController, backLeftController, frontRightController, backRightController);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
       setDefaultCommand(new DriveCommand());
    }
    
    public void roboDrive(double y, double x, double angle) {
    	
    	robotDrive.mecanumDrive_Cartesian(y, x, angle, 0);
    }
}

