package org.firstinspires.ftc.teamcode.senzori;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="Culoare", group="Senzor")
@Disabled
public class CULOAREautonom extends LinearOpMode {

    DcMotor leftDrive;
    DcMotor rightDrive;
    ColorSensor culoare;

    @Override
    public void runOpMode() {
        leftDrive  = hardwareMap.get(DcMotor.class, "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class, "right_drive");
        culoare    = hardwareMap.colorSensor.get("culoare");

        waitForStart();

        while (opModeIsActive()) {
            if(culoare.red() > 2){
                walkRight();
                sleep(2000);
                walkForward();
                sleep(2000);
                taci();
            }
            else if(culoare.blue() > 2);{
                walkLeft();
                sleep(2000);
                walkForward();
                sleep(2000);
                taci();
            }


        }
    }
    public void walkRight(){
        leftDrive.setPower(1);
        rightDrive.setPower(0);
    }
    public void walkLeft(){
        leftDrive.setPower(0);
        rightDrive.setPower(1);
    }
    public void walkForward() {
        leftDrive.setPower(-1);
        rightDrive.setPower(1);
    }
    public void taci(){
        leftDrive.setPower(0);
        rightDrive.setPower(0);
    }
}
