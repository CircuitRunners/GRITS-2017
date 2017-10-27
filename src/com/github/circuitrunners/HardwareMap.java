package com.github.circuitrunners;

import com.github.circuitrunners.akilib.Xbox;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class HardwareMap {
  
  private static final HardwareMap instance = new HardwareMap();
  public static HardwareMap getInstance() { return instance; }

  private HardwareMap() {

  }

  private static final int frontLeftMotor = 5;
  private static final int frontRightMotor = 1;
  private static final int rearLeftMotor = 8;
  private static final int rearRightMotor = 2;
  
  private static final int gryoPort = 3;
  
	public Xbox xbox = new Xbox(0);
	public AnalogGyro gyro = new AnalogGyro(gryoPort);
  public RobotDrive robotDrive = new RobotDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);



}
