package org.usfirst.frc.team1165.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team1165.robot.subsystems.AbsoluteEncoder;
import org.usfirst.frc.team1165.robot.subsystems.Camera;
import org.usfirst.frc.team1165.robot.subsystems.ImuDigitalComboBoard;
import org.usfirst.frc.team1165.robot.subsystems.MaxBotixProximitySensor;
import org.usfirst.frc.team1165.robot.subsystems.RoboRIOAccelerometer;
import org.usfirst.frc.team1165.robot.subsystems.UserButton;
import org.usfirst.frc.team1165.robot.subsystems.VexRangeFinder;
import org.usfirst.frc.team1165.robot.subsystems.Camera.CameraMode;
import org.usfirst.frc.team1165.robot.subsystems.MaxBotixProximitySensor.Model;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot
{
	// Subsystems:
	public static final UserButton userButton = new UserButton();
	public static final RoboRIOAccelerometer roboRIOAccelerometer = new RoboRIOAccelerometer();
//	public static final Camera camera = new Camera(RobotMap.cameraName, CameraMode.SUBSYSTEM);
//	public static final AbsoluteEncoder absoluteEncoder= new AbsoluteEncoder();
//	public static final VexRangeFinder vexRangeFinder = new VexRangeFinder(RobotMap.vexPingChannel, RobotMap.vexEchoChannel);
	
	// We support only one MaxBotix sensor at a time:
//	public static final MaxBotixProximitySensor mb1013 = new MaxBotixProximitySensor(Model.MB1013, new SerialPort(9600, SerialPort.Port.kOnboard), new AnalogInput(3));
//	public static final MaxBotixProximitySensor mb1200 = new MaxBotixProximitySensor(Model.MB1200, new SerialPort(9600, SerialPort.Port.kOnboard), new AnalogInput(3));
	
	public static final ImuDigitalComboBoard imu = new ImuDigitalComboBoard(I2C.Port.kOnboard, new DigitalInput(RobotMap.gyroInterruptChannel));

	
	public static OI oi;

	Command autonomousCommand;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit()
	{
		oi = new OI();
		// instantiate the command used for the autonomous period
		//autonomousCommand = new ExampleCommand();
	}

	public void disabledPeriodic()
	{
		Scheduler.getInstance().run();
	}

	public void autonomousInit()
	{
		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic()
	{
		Scheduler.getInstance().run();
	}

	public void teleopInit()
	{
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}

	/**
	 * This function is called when the disabled button is hit. You can use it
	 * to reset subsystems before shutting down.
	 */
	public void disabledInit()
	{

	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic()
	{
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic()
	{
		LiveWindow.run();
	}
}
