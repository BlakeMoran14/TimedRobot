package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSRX;

public class DriveTrainSubsystem extends SubsystemBase{
    private final Talon m_frontLeft = new Talon(1);
    private final Victor m_midLeft = new Victor(2);
    private final Victor m_rearLeft = new Victor(3);
    private final SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_midLeft, m_rearLeft);

    private final Talon m_frontRight = new Talon(4);
    private final Victor m_midRight = new Victor(5);
    private final Victor m_rearRight = new Victor(6);
    private final SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_midRight, m_rearRight);

    private final DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);
}