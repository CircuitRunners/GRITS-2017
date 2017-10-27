package com.github.circuitrunners.modules;

import com.github.circuitrunners.akilib.Module;

import com.github.circuitrunners.Robot;
import com.github.circuitrunners.akilib.Xbox;

/**
 *
 */
public class DriveModule extends Module {


  public void roboDrive(double x, double y, double angle) {
    Robot.hardwareMap.robotDrive.mecanumDrive_Cartesian(x, y, angle, 0);
  }

  public void teleopPeriodic() {
    roboDrive(Robot.hardwareMap.xbox.get(Xbox.Axis.LEFT_X), Robot.hardwareMap.xbox.get(Xbox.Axis.LEFT_Y), Robot.hardwareMap.xbox.get(Xbox.Axis.RIGHT_X));
//    Timer.delay(0.005); Don't need this; don't use blocking functions if at all possible. Also teleopPeriodic is called at that rate anyway
  }
}

