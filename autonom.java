package org.firstinspires.ftc.teamcode.autonoame;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.hardware;

/**
 * Created by Ana on 3/3/2018.
 */

@Disabled
@Autonomous(name = "plng")
public class autonom extends LinearOpMode {


    /* Declare OpMode members. */
    hardware robot = new hardware();   // Use a Pushbot's hardware


    @Override
    public void runOpMode() throws InterruptedException {

        /*
         * Initialize the standard drive system variables.
         * The init() method of the hardware class does most of the work here
         */
        robot.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {


// 2 sec 30 in
            robot.lbDrive.setPower(1);
            robot.lfDrive.setPower(1);
            robot.rbDrive.setPower(-1);
            robot.rfDrive.setPower(-1);
            sleep(2000);
            robot.lbDrive.setPower(0);
            robot.lfDrive.setPower(0);
            robot.rfDrive.setPower(0);
            robot.rbDrive.setPower(0);
            sleep(200123123123131124L);


//        robot.lbDrive.setPower(-1);
//        robot.lfDrive.setPower(-1);
//        robot.rbDrive.setPower(1);
//        robot.rbDrive.setPower(1);
//        sleep(1500);
//
//
//        robot.lbDrive.setPower(1);
//        robot.lfDrive.setPower(1);
//        robot.rbDrive.setPower(1);
//        robot.rbDrive.setPower(1);
//        sleep(2000);
            idle();
        }


    }
//    public void dece() throws InterruptedException  {
//        wait(2000);
//        robot.lbDrive.setPower(1);
//        robot.lfDrive.setPower(1);
//        robot.rfDrive.setPower(1);
//        robot.rbDrive.setPower(0.8);
//        wait(2000);
//    }
}
