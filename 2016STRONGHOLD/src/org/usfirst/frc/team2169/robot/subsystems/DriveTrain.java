package org.usfirst.frc.team2169.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
    
	public CANTalon leftDrive;
	public CANTalon rightDrive;
	
	public DriveTrain(){
		leftDrive = new CANTalon(1);
		rightDrive = new CANTalon(2);
	}
    public void initDefaultCommand() {
    }
}

