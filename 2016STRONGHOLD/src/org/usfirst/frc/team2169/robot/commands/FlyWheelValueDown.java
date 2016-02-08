package org.usfirst.frc.team2169.robot.commands;

import org.usfirst.frc.team2169.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class FlyWheelValueDown extends Command {

	public boolean done;
	
    public FlyWheelValueDown() {
    }

    protected void initialize() {
    	done = false;
    }

    protected void execute() {
    	Robot.flyWheel.flywheelValue += -100;
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
