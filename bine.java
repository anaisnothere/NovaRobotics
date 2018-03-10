package org.firstinspires.ftc.teamcode.autonoame;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.hardware;

/**
 * Created by ZEUS on 3/7/2018.
 */

@Disabled
@Autonomous(name = "bine")
public class bine extends LinearOpMode {


    /* Declare OpMode members. */
    hardware robot = new hardware();   // Use a Pushbot's hardware


    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            robot.lbDrive.setPower(1);
            robot.lfDrive.setPower(0);
            robot.rbDrive.setPower(1);
            robot.rfDrive.setPower(0);
            sleep(500);
            robot.lbDrive.setPower(-1);
            robot.lfDrive.setPower(0);
            robot.rbDrive.setPower(-1);
            robot.rfDrive.setPower(0);
            sleep(500);
            robot.lbDrive.setPower(0);
            robot.lfDrive.setPower(0);
            robot.rfDrive.setPower(0);
            robot.rbDrive.setPower(0);
            sleep(200123123123131124L);


            idle();
        }


    }
}