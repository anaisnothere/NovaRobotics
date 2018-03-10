package org.firstinspires.ftc.teamcode.senzori;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.TouchSensor;

@TeleOp(name="senzorisidetoate", group="Senzori")
@Disabled
public class senzoricudetoate extends LinearOpMode{

    TouchSensor touch;
    ColorSensor culoare;
    OpticalDistanceSensor ods;
    DcMotor left_motor;
    DcMotor right_motor;

    @Override
    public void runOpMode() {
        waitForStart();

        left_motor = hardwareMap.dcMotor.get("left_drive");
        right_motor = hardwareMap.dcMotor.get("right_drive");
        //ods = hardwareMap.opticalDistanceSensor.get("ods");
        touch        = hardwareMap.touchSensor.get("touch");
        culoare    = hardwareMap.colorSensor.get("culoare");

        while (opModeIsActive()) {



        }
    }
}