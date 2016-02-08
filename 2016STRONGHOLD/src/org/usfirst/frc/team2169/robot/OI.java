package org.usfirst.frc.team2169.robot;

import org.usfirst.frc.team2169.robot.commands.DriveShift;
import org.usfirst.frc.team2169.robot.commands.FlyWheelValueDown;
import org.usfirst.frc.team2169.robot.commands.FlyWheelValueUp;
import org.usfirst.frc.team2169.robot.commands.IntakesSol;
import org.usfirst.frc.team2169.robot.commands.ServoValueDown;
import org.usfirst.frc.team2169.robot.commands.ServoValueUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
    
	public Joystick leftStick;
	public Joystick rightStick;
	public Joystick secondaryStick;
	
	public OI(){
		leftStick = new Joystick(0);
		rightStick = new Joystick(1);
		secondaryStick = new Joystick(2);
		
		JoystickButton flywheelButton = new JoystickButton(secondaryStick, 1);
		JoystickButton servoUpButton = new JoystickButton(secondaryStick, 4);
		JoystickButton servoDownButton = new JoystickButton(secondaryStick, 5);
		JoystickButton flywheelUpButton = new JoystickButton(secondaryStick, 6);
		JoystickButton flywheelDownButton = new JoystickButton(secondaryStick, 7);
		JoystickButton driveShiftButton = new JoystickButton(secondaryStick, 8);
		JoystickButton intakeSolButton = new JoystickButton(secondaryStick, 2);
		
		driveShiftButton.whenPressed(new DriveShift());
		intakeSolButton.whenPressed(new IntakesSol());
		
		//flywheelButton.whileHeld(new FlyWheelGo());
		flywheelUpButton.whenPressed(new FlyWheelValueUp());
		flywheelDownButton.whenPressed(new FlyWheelValueDown());
		
		servoUpButton.whenPressed(new ServoValueUp());
		servoDownButton.whenPressed(new ServoValueDown());
	}

}

