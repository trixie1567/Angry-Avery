package org.usfirst.frc.team2169.robot.commands;

import org.usfirst.frc.team2169.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {

    public TankDrive() {
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.driveTrain.leftDrive.set(Robot.oi.leftStick.getY());
    	Robot.driveTrain.rightDrive.set(Robot.oi.rightStick.getY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
