package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.senzori.autonomcurange;

//nu prea mai cred
@Autonomous(name = "Sensor: Digital touch", group = "Senzor")
@Disabled
public class autonomcred extends LinearOpMode {
    autonomcurange ok = new autonomcurange();

    DcMotor left_motor;
    DcMotor right_motor;
    DcMotor arm_drive;
   // Servo servo1;
   // Servo servo2;

    @Override
    public void runOpMode() {

        left_motor   = hardwareMap.dcMotor.get("left_drive");
        right_motor  = hardwareMap.dcMotor.get("right_drive");
        arm_drive   = hardwareMap.get(DcMotor.class, "arm_drive");
     //   servo1      = hardwareMap.get(Servo.class, "servo1");
     //   servo2      = hardwareMap.get(Servo.class, "servo2");
        waitForStart();

        while (opModeIsActive()) {
          /*  ok.walkForward();
            sleep(2000);
            ok.walkBackwards();
            sleep(1000);
            ok.walkLeft();
            sleep(2000);
            ok.walkRight();
            sleep(4000);*/

           // ok.apuca();
           // ok.ridica();
           // sleep(1000);
            ok.walkForward();
            sleep(1000);
            //ok.lasa();
            //ok.nu();
            //sleep(1000);
            ok.walkForward();
            sleep(4000);
            ok.walkRight();
            sleep(1500);
            ok.walkForward();
            sleep(4000);
            ok.walkRight();
            sleep(1500);
            ok.walkForward();
            sleep(4000);
            ok.walkRight();
            sleep(1500);
            ok.walkForward();
            sleep(4000);
            ok.walkRight();
            sleep(1500);
            ok.taci();


        }
    }

}
