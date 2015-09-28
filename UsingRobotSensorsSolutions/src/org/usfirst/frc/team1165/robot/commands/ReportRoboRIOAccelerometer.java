package org.usfirst.frc.team1165.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1165.robot.Robot;

/**
 * Reports values from the roboRIO accelerometer on the SmartDashboard.
 */
public class ReportRoboRIOAccelerometer extends Command
{

	public ReportRoboRIOAccelerometer()
	{
		// Use requires() here to declare subsystem dependencies
		requires(Robot.roboRIOAccelerometer);
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
		Robot.roboRIOAccelerometer.report();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return true;
	}

	// Called once after isFinished returns true
	protected void end()
	{
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
	}
}
