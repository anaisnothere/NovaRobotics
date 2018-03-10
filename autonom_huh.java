package org.firstinspires.ftc.teamcode.DisabledOrOldCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

//nu cred ca functioneaza asa dar ma rog, first try i guess
@Autonomous(name = "AutonomSauPa")
@Disabled
public class autonom_huh extends LinearOpMode{

    //declaram toate chestiile aici
    DcMotor leftFrontDrive;
    DcMotor rightFrontDrive;
    DcMotor leftBackDrive;
    DcMotor rightBackDrive;
    Servo leftClaw;
    Servo rightClaw;
    DcMotor armDrive;
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() {
        //scriem variabilele ca in telefon ayy
        leftFrontDrive  = hardwareMap.get(DcMotor.class, "lf_drive");
        leftBackDrive   = hardwareMap.get(DcMotor.class, "lb_drive");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "rf_drive");
        rightBackDrive  = hardwareMap.get(DcMotor.class, "rb_drive");
        leftClaw        = hardwareMap.get(Servo.class, "Lclaw_servo");
        rightClaw       = hardwareMap.get(Servo.class, "Rclaw_servo");
        armDrive        = hardwareMap.get(DcMotor.class, "arm_drive");

        waitForStart();
        runtime.reset();


        while (opModeIsActive()) {
            //roti omni tot trebuie sa inteleg asta
            double lfd = 0, rfd = 0, rbd = 0, lbd = 0;
            short dir = 1;

            switch (dir) {
                case 1:
                    lfd = -gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x;
                    rfd = gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x;
                    rbd = gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x;
                    lbd = -gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x;
                    break;
                case 2:
                    lfd = gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x;
                    rfd = -gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x;
                    rbd = -gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x;
                    lbd = gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x;
                    break;
                case 3:
                    lfd = gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x;
                    rfd = gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x;
                    rbd = -gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x;
                    lbd = -gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x;
                    break;
            }
            leftFrontDrive.setPower(lfd);
            rightFrontDrive.setPower(rfd);
            rightBackDrive.setPower(rbd);
            leftBackDrive.setPower(lbd);

        }

    }



}
