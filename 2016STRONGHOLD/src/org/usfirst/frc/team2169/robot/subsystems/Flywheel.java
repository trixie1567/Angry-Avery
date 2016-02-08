package org.usfirst.frc.team2169.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Flywheel extends Subsystem {
    
	public CANTalon flywheel;
	public Servo servo;
	public int servoValue;
	public int flywheelValue;
	
    public Flywheel(){
    	flywheel = new CANTalon(3);
    	flywheel.changeControlMode(ControlMode.Speed);
    	
    	servo = new Servo(1);
    	servoValue = 0;
    	flywheelValue = 0;
    }

    public void initDefaultCommand() {
    }
}

