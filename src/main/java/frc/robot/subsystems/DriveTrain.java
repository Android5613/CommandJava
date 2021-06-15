// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode; //include vendor libraries
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  TalonSRX FrontLeft;
  TalonSRX FrontRight;
  TalonSRX BackLeft;
  TalonSRX BackRight;

  public DriveTrain() {
    TalonSRX FrontLeft = new TalonSRX(Constants.FRONT_LEFT);
    TalonSRX FrontRight = new TalonSRX(Constants.FRONT_RIGHT);
    TalonSRX BackLeft = new TalonSRX(Constants.BACK_LEFT);
    TalonSRX BackRight = new TalonSRX(Constants.BACK_RIGHT);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void arcadeDrive(Joystick driveStick) {
    double speed = driveStick.getY();
    double turn = driveStick.getZ() * -.7;

    speed = speed * Math.abs(speed);
    turn = turn * Math.abs(turn);

    double left = speed + turn;
    double right = speed - turn;

    FrontLeft.set(ControlMode.PercentOutput, left);
    BackLeft.set(ControlMode.PercentOutput, left);
    FrontRight.set(ControlMode.PercentOutput, right);
    BackRight.set(ControlMode.PercentOutput, right);
  }
}
