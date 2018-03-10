package org.firstinspires.ftc.teamcode.autonoame;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.hardware;

/**
 * Created by Ana on 3/4/2018.
 */

@Autonomous(name = "RED/DOWN")
public class rd_autonom extends LinearOpMode {


    final int tm = 300; //6 inch 0.3 secunda, tm = timp mers
    final int ti = 800; //1 secunde 90 degreeeees
    boolean flag = true;

    /* Declare OpMode members. */
    hardware robot = new hardware();


    @Override
    public void runOpMode() {

        robot.init(hardwareMap);

        waitForStart();
        while (opModeIsActive()) {

            // send the info back to driver station using telemetry function.
            telemetry.addData("LED", true ? "On" : "Off");
            telemetry.addData("Red  ", robot.colorSensor.red());
            telemetry.addData("Blue ", robot.colorSensor.blue());
            telemetry.update();

            robot.colorSensor.enableLed(true);

            if (flag) {
                robot.cr.setPower(-1);
                sleep(3750);
                robot.cr.setPower(0);
                sleep(200);
                flag = false;
            }

            if (robot.colorSensor.blue() > robot.colorSensor.red()) {
                robot.lbDrive.setPower(1);
                robot.lfDrive.setPower(1);
                robot.rbDrive.setPower(1);
                robot.rfDrive.setPower(1);
                sleep(tm);
                staph();
                sleep(200);
                robot.cr.setPower(1);
                sleep(3900);
                robot.cr.setPower(0);

                walkForward();
                sleep(tm * 3);
                staph();
                sleep(200);
                turnLeft();
                sleep(ti);
                staph();
                sleep(200);
                walkForward();
                sleep(tm * 2);
                staph();
                sleep(200);
                turnRight();
                sleep(ti);
                staph();
                sleep(200);
                walkForward();
                sleep(tm * 2);
                staph();
                sleep(200123123123131124L);

            } else if (robot.colorSensor.red() > robot.colorSensor.blue()) {
                robot.lbDrive.setPower(-1);
                robot.lfDrive.setPower(-1);
                robot.rbDrive.setPower(-1);
                robot.rfDrive.setPower(-1);
                sleep(tm);
                staph();
                sleep(200);
                robot.cr.setPower(1);
                sleep(3900);
                robot.cr.setPower(0);

                walkForward();
                sleep(tm * 6);
                staph();
                sleep(200);
                turnLeft();
                sleep(ti);
                staph();
                sleep(200);
                walkForward();
                sleep(tm * 2);
                staph();
                sleep(200);
                turnRight();
                sleep(ti);
                staph();
                sleep(200);
                walkForward();
                sleep(tm * 2);
                staph();
                sleep(200123123123131124L);
            }
        }


    }


    public void walkForward() {
        robot.lbDrive.setPower(1);
        robot.lfDrive.setPower(1);
        robot.rbDrive.setPower(1);
        robot.rfDrive.setPower(1);
    }

    public void walkBackwards() {
        robot.lbDrive.setPower(-1);
        robot.lfDrive.setPower(-1);
        robot.rbDrive.setPower(-1);
        robot.rfDrive.setPower(-1);
    }

    public void turnRight() {
        robot.lbDrive.setPower(1);
        robot.lfDrive.setPower(1);
        robot.rbDrive.setPower(-1);
        robot.rfDrive.setPower(-1);
    }

    public void turnLeft() {
        robot.lbDrive.setPower(-1);
        robot.lfDrive.setPower(-1);
        robot.rbDrive.setPower(1);
        robot.rfDrive.setPower(1);
    }

    public void staph() {
        robot.lbDrive.setPower(0);
        robot.lfDrive.setPower(0);
        robot.rbDrive.setPower(0);
        robot.rfDrive.setPower(0);
    }

//    public void apuca() {
//        robot.sl.setPosition(1);
//        robot.sr.setPosition(1);
//    }
//
//    public void nu() {
//        robot.sl.setPosition(0);
//        robot.sr.setPosition(0);
//    }

//pentru bila
//    public void bila(){
//        robot.sb.setPosition(0.8);
//    }
}