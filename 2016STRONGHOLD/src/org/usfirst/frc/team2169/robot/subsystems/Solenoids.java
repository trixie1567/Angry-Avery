package org.usfirst.frc.team2169.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Solenoids extends Subsystem {
    
	public DoubleSolenoid leftDriveSol;
	public DoubleSolenoid rightDriveSol;
	
	public DoubleSolenoid leftIntakeSol;
	public DoubleSolenoid rightIntakeSol;
	
    public Solenoids(){
    	leftDriveSol = new DoubleSolenoid(0,0,0);
    	rightDriveSol = new DoubleSolenoid(0,0,1);
    	leftIntakeSol = new DoubleSolenoid(0,2,3);
    	rightIntakeSol = new DoubleSolenoid(0,4,5);
    }

    public void initDefaultCommand() {
    }
}

