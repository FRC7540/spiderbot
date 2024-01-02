package frc.robot;

public class Constants {

    // Field Centric Control
    public static boolean kDefaultFieldCentric = false;

    // steering module encoder
    public static final int kEncoderResolution = 4096;
    public static final double kTicksPerDegree = kEncoderResolution / 360;

    // motors
    public static final int kFrontLeftDrive = 10;
    public static final int kFrontLeftTurning = 11;

    public static final int kFrontRightDrive = 16;
    public static final int kFrontRightTurning = 17;

    public static final int kRearLeftDrive = 12;
    public static final int kRearLeftTurning = 13;

    public static final int kRearRightDrive = 14;
    public static final int kRearRightTurning = 15;

    // Drive speed input voltage modifier
    public static final double kDriveSpeedVoltageModifier = 4.0;

    // Speed Controls (slow)
    public static final double kMaxSpeed = 1.5; // 1.5 meters per second
    public static final double kMaxAngularSpeed = Math.PI; // Control speed of rotation

    // (normal)
    // public static final double kMaxSpeed = 3.0; // 3 meters per second
    // public static final double kMaxAngularSpeed = 4 * Math.PI; // Control speed
    // of rotation

    // Deadband for crappy joystick
    public static final double kDeadband = 0.05;

    // Tornado spin limiter
    public static final double kSpinLimiter = 0.5;

    // Slew rate limiter, Slew rate limiters to make joystick inputs more gentle;
    // 1/3 sec from 0 to 1
    public static final double kSlewRateLimiter = 3.0;

}
