package org.firstinspires.ftc.teamcode.DisabledOrOldCode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "PushbotAutonom")
@Disabled
public class patrat_cred extends LinearOpMode {
    //autonom 3 motoare 2 servo-uri

    // aici declari variabile
    DcMotor leftDrive;
    DcMotor rightDrive;
    DcMotor armDrive;
    Servo servo1;
    Servo servo2;

    @Override
    public void runOpMode() {
        // aici contorizezi numele variabilelor cu cele din telefon

        leftDrive = hardwareMap.get(DcMotor.class, "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");
        armDrive = hardwareMap.get(DcMotor.class, "arm_drive");
        servo1 = hardwareMap.get(Servo.class, "servo1");
        servo2 = hardwareMap.get(Servo.class, "servo2");

        waitForStart();

        while (opModeIsActive()) {
            // aici dai comenzile de movement

            leftDrive.setPower(1);
            rightDrive.setPower(1);
            sleep(3000);
            leftDrive.setPower(0);
            rightDrive.setPower(1);
            sleep(2000);
            leftDrive.setPower(1);
            rightDrive.setPower(1);
            sleep(3000);
            leftDrive.setPower(0);
            rightDrive.setPower(1);
            sleep(2000);
            leftDrive.setPower(1);
            rightDrive.setPower(1);
            sleep(3000);
            leftDrive.setPower(0);
            rightDrive.setPower(1);
            sleep(2000);
            leftDrive.setPower(1);
            rightDrive.setPower(1);
            sleep(3000);
            leftDrive.setPower(0);
            rightDrive.setPower(1);
            sleep(2000);
        }
    }
}