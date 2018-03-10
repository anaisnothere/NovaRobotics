package org.firstinspires.ftc.teamcode;

/**
 * Created by ZEUS on 3/7/2018.
 */

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;

/**
 * A simple test of a continuous rotation servo
 */

@Disabled
@Autonomous(name = "Test CR Servo")
public class testcrsevo extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        CRServo servo = this.hardwareMap.crservo.get("crservo");

        waitForStart();
        telemetry.addData("Servo Position", servo.getPower());
        telemetry.update();

        servo.setPower(1.0);
        Thread.sleep(4000);

        servo.setPower(0.0);
        Thread.sleep(1000);

        servo.setPower(-1.0);
        Thread.sleep(4000);
    }
}