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
    private final WPI_TalonSRX leftOne = new WPI_TalonSRX(0);
    private final WPI_VictorSRX leftTwo = new WPI_VictorSRX(1);
    private final WPI_VictorSRX leftThree = new WPI_VictorSRX(2);
    private final WPI_TalonSRX rightOne = new WPI_TalonSRX(3);
    private final WPI_VictorSRX rightTwo = new WPI_VictorSRX(4);
    private final WPI_VictorSRX rightThree = new WPI_VictorSRX(5);
}