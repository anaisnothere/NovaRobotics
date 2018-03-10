package org.firstinspires.ftc.teamcode.DisabledOrOldCode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Pushbot3Motoare")
public class TreiMotoare extends LinearOpMode {

    //3 motoare joystick

    // aici declari variabile
    DcMotor leftDrive;
    DcMotor rightDrive;
    DcMotor armDrive;
    DcMotor okdrive;

    @Override
    public void runOpMode() {

        // aici contorizezi numele variabilelor cu cele din telefon
        leftDrive  = hardwareMap.get(DcMotor.class, "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");
        armDrive   = hardwareMap.get(DcMotor.class, "arm_drive");
        okdrive    = hardwareMap.get(DcMotor.class, "ok_drive");

        waitForStart();

        while (opModeIsActive()) {
            // aici dai comenzile de movement
            leftDrive.setPower(gamepad1.left_stick_y);
            rightDrive.setPower(-gamepad1.left_stick_y);
            armDrive.setPower(gamepad1.right_stick_y);
            okdrive.setPower(-gamepad1.right_stick_y);

        }
    }
}