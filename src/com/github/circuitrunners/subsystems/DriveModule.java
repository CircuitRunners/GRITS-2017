package com.github.circuitrunners.subsystems;

import com.github.circuitrunners.akilib.Module;

import com.github.circuitrunners.Robot;
import com.github.circuitrunners.RobotMap;
import com.github.circuitrunners.akilib.Xbox;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class DriveModule extends Module {

  private RobotDrive robotDrive = new RobotDrive(RobotMap.frontLeftMotor, RobotMap.BackLeftMotor, RobotMap.frontRightMotor, RobotMap.BackLeftMotor);

  public void roboDrive(double y, double x, double angle) {
    robotDrive.mecanumDrive_Cartesian(y, x, angle, 0);
  }

  public void teleopPeriodic() {
    roboDrive(Robot.hardwareMap.xbox.get(Xbox.Axis.LEFT_X), Robot.hardwareMap.xbox.get(Xbox.Axis.LEFT_Y), Robot.hardwareMap.xbox.get(Xbox.Axis.RIGHT_X));
//    Timer.delay(0.005); Don't need this; don't use blocking functions if at all possible. Also teleopPeriodic is called at that rate anyway
  }
}

