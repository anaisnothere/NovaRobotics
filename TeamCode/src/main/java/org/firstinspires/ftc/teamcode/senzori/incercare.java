package org.firstinspires.ftc.teamcode.senzori;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;


@Autonomous(name = "binebien")
public class incercare extends LinearOpMode {
    //private ElapsedTime runtime = new ElapsedTime();
    DcMotor left_motor;
    DcMotor right_motor;
    DcMotor arm_drive;
    Servo servo1;
    Servo servo2;

    //autonomcurange biness = new autonomcurange();
    @Override
    public void runOpMode() {
        waitForStart();
        left_motor   = hardwareMap.dcMotor.get("left_drive");
        right_motor  = hardwareMap.dcMotor.get("right_drive");
        arm_drive   = hardwareMap.get(DcMotor.class, "arm_drive");
        servo1      = hardwareMap.get(Servo.class, "servo1");
        servo2      = hardwareMap.get(Servo.class, "servo2");
       // runtime.reset();
       /* biness.walkForward();
        sleep(2000);
        biness.walkBackwards();
        sleep(1000);
        biness.walkLeft();
        sleep(2000);
        biness.walkRight();
        sleep(4000);*/


       left_motor.setPower(1);
       right_motor.setPower(-1);
       arm_drive.setPower(1);
       sleep(1000);
       servo1.setPosition(0.85);
       servo2.setPosition(0);
       sleep(1000);
       servo1.setPosition(0);
       servo2.setPosition(0.85);


    }
}
