package org.usfirst.frc.team1165.robot.commands;

import org.usfirst.frc.team1165.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SetPidDemoSetpoint extends Command
{
	private double setpoint;
	private String setpointKey;
	
	private SetPidDemoSetpoint()
	{
		requires(Robot.pidDemo);
	}

	public SetPidDemoSetpoint(double setpoint)
	{
		this();
		this.setpoint = setpoint;
	}

	public SetPidDemoSetpoint(String setpointKey)
	{
		this();
		this.setpointKey = setpointKey;
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		if (setpointKey != null)
		{
			setpoint = SmartDashboard.getNumber(setpointKey);
		}
		
		Robot.pidDemo.setSetpoint(setpoint);
		Robot.pidDemo.enable();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return Robot.pidDemo.onTarget();
	}

	// Called once after isFinished returns true
	protected void end()
	{
		Robot.pidDemo.disable();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		end();
	}
}
