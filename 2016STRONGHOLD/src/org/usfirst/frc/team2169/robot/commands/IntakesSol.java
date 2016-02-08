package org.usfirst.frc.team2169.robot.commands;

import org.usfirst.frc.team2169.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

public class IntakesSol extends Command {

	public boolean done;
	
    public IntakesSol() {
    }

    protected void initialize() {
    	done = false;
    }

    protected void execute() {
    	if(Robot.solenoids.leftIntakeSol.get() == DoubleSolenoid.Value.kOff){
    		Robot.solenoids.leftIntakeSol.set(DoubleSolenoid.Value.kForward);
    		Robot.solenoids.rightIntakeSol.set(DoubleSolenoid.Value.kForward);
    	}else if(Robot.solenoids.leftIntakeSol.get() == DoubleSolenoid.Value.kForward){
    		Robot.solenoids.leftIntakeSol.set(DoubleSolenoid.Value.kReverse);
    		Robot.solenoids.rightIntakeSol.set(DoubleSolenoid.Value.kReverse);
    	}
    	else if(Robot.solenoids.leftIntakeSol.get() == DoubleSolenoid.Value.kReverse){
    		Robot.solenoids.leftIntakeSol.set(DoubleSolenoid.Value.kForward);
    		Robot.solenoids.rightIntakeSol.set(DoubleSolenoid.Value.kForward);
    	}
    	done = true;
    }

    protected boolean isFinished() {
        return done;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
