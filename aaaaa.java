package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import java.util.Arrays;

@Disabled
@TeleOp(name = "aaaa")
public class aaaaa extends LinearOpMode {
    DcMotor left_back_drive;
    DcMotor right_back_drive;
    DcMotor left_front_drive;
    DcMotor right_front_drive;
//    DcMotor arm_drive;
//    Servo servo1;
//    Servo servo2;
//    double alfa;

    //   float fata = gamepad1.left_stick_y;
    //float spate = -gamepad1.left_stick_y;
    // float left = -gamepad1.left_stick_y;
    //  float right = gamepad1.right_stick_y;
    //double drive;
    //double turn;
    //  double max;
    // double left;
    //  double right;

    @Override
    public void runOpMode() {

        left_back_drive = hardwareMap.get(DcMotor.class, "lb");
        left_front_drive = hardwareMap.get(DcMotor.class, "lf");
        right_back_drive = hardwareMap.get(DcMotor.class, "rb");
        right_front_drive = hardwareMap.get(DcMotor.class, "rf");


        left_back_drive.setDirection(DcMotor.Direction.FORWARD);
        left_front_drive.setDirection(DcMotor.Direction.REVERSE);
        right_back_drive.setDirection((DcMotor.Direction.REVERSE));
        right_front_drive.setDirection(DcMotor.Direction.FORWARD);

        waitForStart();


        while (opModeIsActive()) {
            if (gamepad1.dpad_down) {
                left_front_drive.setPower(1);
            } else {
                left_front_drive.setPower(0);
            }


            if (gamepad1.dpad_up) {
                right_front_drive.setPower(1);
            } else {
                right_front_drive.setPower(0);
            }


            if (gamepad1.dpad_left) {
                left_back_drive.setPower(1);
            } else {
                left_back_drive.setPower(0);
            }


            if (gamepad1.dpad_down) {
                right_back_drive.setPower(1);
            } else {

                right_back_drive.setPower(0);
            }

        }


    }
}
