package org.firstinspires.ftc.teamcode.DisabledOrOldCode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

//habar n-am de ce e asta diferita fata de cealalta dar ayyy
@TeleOp(name = "fuck me :(")
@Disabled
public class ce extends LinearOpMode {

    //declaram toate chestiile aici
    DcMotor leftFrontDrive;
    DcMotor rightFrontDrive;
    DcMotor leftBackDrive;
    DcMotor rightBackDrive;
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() {
        //scriem variabilele ca in telefon ayy
        leftFrontDrive = hardwareMap.get(DcMotor.class, "lf_drive");
        leftBackDrive = hardwareMap.get(DcMotor.class, "lb_drive");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "rf_drive");
        rightBackDrive = hardwareMap.get(DcMotor.class, "rb_drive");

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
