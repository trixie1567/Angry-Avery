package org.usfirst.frc.team2169.robot.commands;

import org.usfirst.frc.team2169.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ServoValueUp extends Command {

	public boolean done;
	
    public ServoValueUp() {
    }

    protected void initialize() {
    	done = false;
    }

    protected void execute() {
    	Robot.flyWheel.servoValue += 10;
    	Robot.flyWheel.servo.setAngle(Robot.flyWheel.servoValue);
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
