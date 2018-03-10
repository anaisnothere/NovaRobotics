package org.firstinspires.ftc.teamcode.senzori;

import android.hardware.Sensor;
import android.text.method.Touch;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

//nu stiu daca merge dar macar am incercat = (
@TeleOp(name = "touch", group = "Senzor")
@Disabled
public class Apasare extends LinearOpMode {
    //declar senzorul
    TouchSensor touch;
   // DcMotor left_drive;
   // DcMotor right_drive;

    @Override
    public void runOpMode() {
        //aici asa e numele din telefon si apoi spunem ca senzorul aduce informatii, adica input
        touch = hardwareMap.touchSensor.get("touch");
      //  left_drive = hardwareMap.dcMotor.get("left");
       // right_drive =

        waitForStart();

        while (opModeIsActive()) {
            //aici scrie el pe telefon daca senzorul e apasat sau nu, gen 0 si 1 (cred)
            //cel putin asa e in teorie dunt blame me
        /*    if(touch.isPressed()){

                telemetry.addData("Digital Touch", "is pressed");
            }
            else{
                telemetry.addData("Digital Touch", "is not pressed");
            } */
        telemetry.addData("Digital Touch", touch.isPressed());
            telemetry.update();
        }
    }
}
