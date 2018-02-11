package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="JOYstick")
public class JOYstick extends LinearOpMode{
    DcMotor left_drive;
    DcMotor right_drive;
    DcMotor arm_drive;
    Servo servo1;
    Servo servo2;
    double drive;
    double turn;
    double max;
    double left;
    double right;

    @Override
    public void runOpMode() {

        left_drive  = hardwareMap.get(DcMotor.class, "left_drive");
        right_drive = hardwareMap.get(DcMotor.class, "right_drive");
        arm_drive   = hardwareMap.get(DcMotor.class, "arm_drive");
        servo1      = hardwareMap.get(Servo.class, "servo1");
        servo2      = hardwareMap.get(Servo.class, "servo2");

        waitForStart();


        while (opModeIsActive()) {
            drive = gamepad1.right_stick_x;
            turn  = gamepad1.left_stick_y;
            left  = drive + turn;
            right = drive - turn;

            // asta e luat de pe net =))
            max = Math.max(Math.abs(left),Math.abs(right));
            if (max > 1.0) {
                left  /= max;
                right /= max;
            }

            left_drive.setPower(left/2);
            right_drive.setPower(right/2);

            if(gamepad1.x){
                servo1.setPosition(0);
                servo2.setPosition(0.85);
            }
            else if(gamepad1.y){
                servo1.setPosition(0.85);
                servo2.setPosition(0);
            }


            if(gamepad1.right_bumper){
                arm_drive.setPower(0.45);
            }
            else if(gamepad1.left_bumper){
                arm_drive.setPower(-0.45);
            }
            else{
                arm_drive.setPower(0);
            }


        }
    }
}
