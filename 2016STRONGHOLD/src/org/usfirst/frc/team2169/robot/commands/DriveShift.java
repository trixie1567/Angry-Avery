package org.usfirst.frc.team2169.robot.commands;

import org.usfirst.frc.team2169.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

public class DriveShift extends Command {

	public boolean done;
	
    public DriveShift() {
    }

    protected void initialize() {
    	done = false;
    }

    protected void execute() {
    	if(Robot.solenoids.leftDriveSol.get() == DoubleSolenoid.Value.kOff){
    		Robot.solenoids.leftDriveSol.set(DoubleSolenoid.Value.kForward);
    		Robot.solenoids.rightDriveSol.set(DoubleSolenoid.Value.kForward);
    	}else if(Robot.solenoids.leftDriveSol.get() == DoubleSolenoid.Value.kForward){
    		Robot.solenoids.leftDriveSol.set(DoubleSolenoid.Value.kReverse);
    		Robot.solenoids.rightDriveSol.set(DoubleSolenoid.Value.kReverse);
    	}
    	else if(Robot.solenoids.leftDriveSol.get() == DoubleSolenoid.Value.kReverse){
    		Robot.solenoids.leftDriveSol.set(DoubleSolenoid.Value.kForward);
    		Robot.solenoids.rightDriveSol.set(DoubleSolenoid.Value.kForward);
    	}
    	done = true;
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
