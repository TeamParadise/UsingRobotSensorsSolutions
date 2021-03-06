package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.RobotMap;
import org.usfirst.frc.team1165.robot.commands.Reporter;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Class that provides access to the MA3-A10-250-N Absolute Encoder.
 */
public class AbsoluteEncoder extends ReportableSubsystem implements PIDSource
{
	private AnalogInput analogInput = new AnalogInput(RobotMap.absoluteEncoderPort);
	private AnalogPotentiometer encoder = new AnalogPotentiometer(analogInput, 360.0, 0);
	
	/**
	 * Returns the value of the encoder in degrees from 0 to 360.
	 */
	public double get()
	{
		return encoder.get();
	}
	
	/**
	 * Returns the underlying analog potentiometer.
	 */
	public AnalogPotentiometer getPot()
	{
		return encoder;
	}

	/**
	 * Set default command to report status on SmartDashboard.
	 */
	@Override
	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		setDefaultCommand(new Reporter(this));
	}
	
	/**
	 * Provides input for a PID controller.
	 */
	@Override
	public double pidGet()
	{
		return get();
	}
	
	/**
	 * Report meaningful information on the SmartDashboard.
	 */
	public void report()
	{
		SmartDashboard.putNumber("Analog Input Voltage", analogInput.getVoltage());
		SmartDashboard.putNumber("Analog Input Value", analogInput.getValue());
		SmartDashboard.putNumber("Absolute Encoder Value", get());;
	}
}
