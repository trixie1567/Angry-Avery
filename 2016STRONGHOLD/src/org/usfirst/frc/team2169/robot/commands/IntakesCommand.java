package org.usfirst.frc.team2169.robot.commands;

import org.usfirst.frc.team2169.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakesCommand extends Command {

    public IntakesCommand() {
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.intakes.intakesOverBumper.set(Robot.oi.secondaryStick.getY());
    	Robot.intakes.intakesInRobot.set(Robot.oi.secondaryStick.getY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
