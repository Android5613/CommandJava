// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    // Can bus identities of the TalonSRX motor controllers on the robot.
	public static final int FRONT_LEFT = 0;
	public static final int FRONT_RIGHT = 2;
	public static final int BACK_LEFT = 1;
	public static final int BACK_RIGHT = 3;

    // USB Ports on the driverstation
    public static final int DRIVER_JOYSTICK = 0;
    public static final int BUTTON_PAD = 1;

    // PWM ports of the sparks on the robot.
    public static final int COLOR_WHEEL_THINGY = 1;
    public static final int WINCH = 2;
    public static final int FLYWHEEL = 3;
    public static final int INTAKE_ROLLERS = 4;
    public static final int INTAKE_ARM = 5;
    public static final int TELESCOPE = 6;
    public static final int CAROUSEL = 7;
    public static final int SHOOTER_INTAKE = 8;
    public static final int BLINKIN = 9;
}
