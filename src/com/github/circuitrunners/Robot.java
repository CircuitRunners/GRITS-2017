
package com.github.circuitrunners;

import java.util.Iterator;
import java.util.LinkedList;

import edu.wpi.first.wpilibj.IterativeRobot;

import com.github.circuitrunners.akilib.Module;

import com.github.circuitrunners.modules.DriveModule;

/*
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final HardwareMap hardwareMap = HardwareMap.getInstance();

	private static final LinkedList<Module> moduleList = new LinkedList<>();
	private static Iterator<Module> moduleListIterator;

	public Robot()
	{
		moduleList.add(new DriveModule());

		moduleListIterator = moduleList.listIterator();
	}

	/*
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
	  while(moduleListIterator.hasNext()) moduleListIterator.next().robotInit();
	}

	/*
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {
    while(moduleListIterator.hasNext()) moduleListIterator.next().disabledInit();
	}

	@Override
	public void disabledPeriodic() {
    while(moduleListIterator.hasNext()) moduleListIterator.next().disabledPeriodic();
  }

	/*
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
    while(moduleListIterator.hasNext()) moduleListIterator.next().autonomousInit();
  }

	/*
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
    while(moduleListIterator.hasNext()) moduleListIterator.next().autonomousPeriodic();
  }

	@Override
	public void teleopInit() {
    while(moduleListIterator.hasNext()) moduleListIterator.next().teleopInit();
  }

	/*
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
    while(moduleListIterator.hasNext()) moduleListIterator.next().teleopPeriodic();
  }

	/*
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
    while(moduleListIterator.hasNext()) moduleListIterator.next().testPeriodic();
  }
}
