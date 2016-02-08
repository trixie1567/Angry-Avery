package org.usfirst.frc.team2169.robot;

import org.usfirst.frc.team2169.robot.commands.AutoDecision;
import org.usfirst.frc.team2169.robot.commands.DriveShift;
import org.usfirst.frc.team2169.robot.commands.FlyWheelValueDown;
import org.usfirst.frc.team2169.robot.commands.FlyWheelValueUp;
import org.usfirst.frc.team2169.robot.commands.IntakesCommand;
import org.usfirst.frc.team2169.robot.commands.IntakesSol;
import org.usfirst.frc.team2169.robot.commands.ServoValueDown;
import org.usfirst.frc.team2169.robot.commands.ServoValueUp;
import org.usfirst.frc.team2169.robot.commands.TankDrive;
import org.usfirst.frc.team2169.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2169.robot.subsystems.Flywheel;
import org.usfirst.frc.team2169.robot.subsystems.Intakes;
import org.usfirst.frc.team2169.robot.subsystems.Sensors;
import org.usfirst.frc.team2169.robot.subsystems.Solenoids;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	public static DriveTrain driveTrain;
	public static Solenoids solenoids;
	public static Flywheel flyWheel;
	public static Intakes intakes;
	public static Sensors sensors;
	public static OI oi;
	
	public Command tankDrive;
	public Command flyWheelGo;
	public Command flyWheelValueUp;
	public Command flyWheelValueDown;
	public Command servoValueUp;
	public Command servoValueDown;
	public Command intakesCommand;
	public Command driveShift;
	public Command intakesSol;
	public Command autoDecision;

    public void robotInit() {
    	driveTrain = new DriveTrain();
    	solenoids = new Solenoids();
    	flyWheel = new Flywheel();
    	intakes = new Intakes();
    	sensors = new Sensors();
		oi = new OI();
		
		tankDrive = new TankDrive();
		
		//flyWheelGo = new FlyWheelGo();
		flyWheelValueUp = new FlyWheelValueUp();
		flyWheelValueDown = new FlyWheelValueDown();
		
		servoValueUp = new ServoValueUp();
		servoValueDown = new ServoValueDown();
		
		intakesCommand = new IntakesCommand();
		
		intakesSol = new IntakesSol();
		driveShift = new DriveShift();
		
		autoDecision = new AutoDecision();
		
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
       
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        
        SmartDashboard.putData("Low Bar", new AutoDecision(1));
        SmartDashboard.putData("Rock Wall", new AutoDecision(2));
        SmartDashboard.putData("Moat", new AutoDecision(3));
        SmartDashboard.putData("PortCullis", new AutoDecision(4));
        SmartDashboard.putData("Drawbridge", new AutoDecision(5));
    }

    public void teleopInit() {
    	Robot.sensors.gyro.reset();
    }

    public void disabledInit(){

    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        tankDrive.start();
        intakesCommand.start();
        
        SmartDashboard.putDouble("X: ", Robot.sensors.accel.getX());
        SmartDashboard.putDouble("Y: ", Robot.sensors.accel.getY());
        SmartDashboard.putDouble("Z: ", Robot.sensors.accel.getZ());
        SmartDashboard.putDouble("Gyro Angle: ", Robot.sensors.gyro.getAngle());
        SmartDashboard.putDouble("Gyro Rate: ", Robot.sensors.gyro.getRate());
        //SmartDashboard.putDouble("Encoders: ", Robot.sensors.leftDriveEnc.);
//        try{
//        	SmartDashboard.getDouble("distance");
//        } catch(Exception e){
//        	e.printStackTrace();
//        }
    }

    public void testPeriodic() {
        LiveWindow.run();
    }
}
