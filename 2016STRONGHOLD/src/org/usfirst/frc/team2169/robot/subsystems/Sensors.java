package org.usfirst.frc.team2169.robot.subsystems;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Sensors extends Subsystem {
    
	public Encoder flywheelEnc;
	public Encoder leftDriveEnc;
	public Encoder rightDriveEnc;
	public Encoder hangEnc;
	
	public BuiltInAccelerometer accel;
	
	public Gyro gyro;
	
	public Sensors(){
		flywheelEnc = new Encoder(0,0);
		leftDriveEnc = new Encoder(0,1);
		rightDriveEnc = new Encoder(0,2);
		hangEnc = new Encoder(0,3);
		
		accel = new BuiltInAccelerometer();
		
		gyro = new Gyro(1);
		
	}

    public void initDefaultCommand() {
    }
}

