package com.github.circuitrunners;

import com.github.circuitrunners.akilib.Xbox;
import edu.wpi.first.wpilibj.AnalogGyro;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class HardwareMap {

  public static final HardwareMap instance = new HardwareMap();
  public static HardwareMap getInstance() { return instance; }

	public Xbox xbox = new Xbox(0);
	public AnalogGyro gyro = new AnalogGyro(RobotMap.gryoPort);


}
