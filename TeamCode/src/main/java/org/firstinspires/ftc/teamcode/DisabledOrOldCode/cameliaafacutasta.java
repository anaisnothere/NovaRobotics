package org.firstinspires.ftc.teamcode.DisabledOrOldCode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "ciorba", group = "Linear Opmode")
@Disabled
public class cameliaafacutasta extends LinearOpMode {

    // Declare OpMode members.
    DcMotor leftDrive;
    DcMotor rightDrive;
  //  DcMotor armDrive;
    Servo servo1;
    Servo servo2;

    @Override
    public void runOpMode() {
        leftDrive = hardwareMap.get(DcMotor.class, "nuvreau");
        rightDrive = hardwareMap.get(DcMotor.class, "decee");
       // armDrive = hardwareMap.get(DcMotor.class, "arm_drive");
        servo1 = hardwareMap.get(Servo.class, "servo1");
        servo2 = hardwareMap.get(Servo.class, "servo2");

        waitForStart();

        while (opModeIsActive()) {
            leftDrive.setPower(gamepad1.left_stick_y);
            rightDrive.setPower(gamepad1.right_stick_y);
           // armDrive.setPower(gamepad1.left_stick_x);

            if (gamepad1.x) {
                servo1.setPosition(0.65);
            } else {
                servo1.setPosition(0);
            }
            if (gamepad1.y) {
                servo2.setPosition(0);
            } else {
                servo2.setPosition(0.65);
            }


        }

    }
}


