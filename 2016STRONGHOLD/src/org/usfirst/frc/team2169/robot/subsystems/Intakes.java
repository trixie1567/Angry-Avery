package org.usfirst.frc.team2169.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intakes extends Subsystem {
    
	public CANTalon intakesOverBumper;
	public CANTalon intakesInRobot;
	
	public Intakes(){
		intakesOverBumper = new CANTalon(4);
		intakesInRobot = new CANTalon(5);
	}

    public void initDefaultCommand() {
    }
}

