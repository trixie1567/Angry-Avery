package org.usfirst.frc.team2169.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class AutoDecision extends Command {

	 public AutoDecision() {
	    	
	    }
	 
    public AutoDecision(int x) {
    	switch(x){
    	case 1:
    		//run first auto program
    		break;
    	case 2:
    		//run second auto program
    		break;
    	}
    }

    protected void initialize() {
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
