package org.usfirst.frc.team1002.robot.subsystems;

import org.usfirst.frc.team1002.robot.RobotMap;
import org.usfirst.frc.team1002.robot.commands.GyroCommand;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gyroscope extends Subsystem {
	private AnalogGyro myGyro = new AnalogGyro(RobotMap.gryoPort);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new GyroCommand());
    }
}

