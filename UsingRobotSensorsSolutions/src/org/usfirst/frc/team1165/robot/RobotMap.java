package org.usfirst.frc.team1165.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap
{
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	// Name of camera:
	public final static String cameraName = "cam11";

	// For accessing the absolute encoder:
	public static int absoluteEncoderPort = 2;
	
	// Analog output channels for LEDs:
	public static int redLedChannel = 1;
	public static int greenLedChannel = 0;
	
	// For accessing the VEX ultrasonic range finder:
	public static int vexPingChannel = 0;
	public static int vexEchoChannel = 1;
	
	// Digital input channel for receiving inputs from gyro:
	public static int gyroInterruptChannel = 9;
	
	public static String pidDemoSetpointKey = "PID Demo Setpoint";
}
