package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.commands.ReportRoboRIOAccelerometer;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Provides access to the roboRIO built-in accelerometer.
 */
public class RoboRIOAccelerometer extends Subsystem
{
	private BuiltInAccelerometer accelerometer = new BuiltInAccelerometer();
	
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	// Returns X axis acceleration
	public double getX()
	{
		return accelerometer.getX();
	}
	
	// Returns Y axis acceleration
	public double getY()
	{
		return accelerometer.getY();
	}
	
	// Returns Z axis acceleration
	public double getZ()
	{
		return accelerometer.getZ();
	}

	// Set the default command to report values on the SmartDashboard.
	public void initDefaultCommand()
	{
		setDefaultCommand(new ReportRoboRIOAccelerometer());
	}
	
	// Reports the values of this subsystem on the SmartDashBoard.
	public void report()
	{
		SmartDashboard.putNumber("roboRIO X Accel", getX());
		SmartDashboard.putNumber("roboRIO Y Accel", getY());
		SmartDashboard.putNumber("roboRIO Z Accel", getZ());
	}
}
