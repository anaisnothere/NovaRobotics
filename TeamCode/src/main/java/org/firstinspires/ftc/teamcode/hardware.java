package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Ana on 2/11/2018.
 */

public class hardware {

    public DcMotor lbDrive      = null;
    public DcMotor rbDrive      = null;
    public DcMotor lfDrive      = null;
    public DcMotor rfDrive      = null;
    public Servo   lclaw        = null;
    public Servo   rcalw        = null;


    /* local OpMode members. */
    HardwareMap hwMap         = null;

    public void Hardware() {

    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        lbDrive  = hwMap.get(DcMotor.class, "lbDrive");
        rbDrive = hwMap.get(DcMotor.class, "rbDrive");
        lfDrive = hwMap.get(DcMotor.class, "lfDrive");
        rfDrive = hwMap.get(DcMotor.class, "rfDrive");

        lbDrive.setDirection(DcMotor.Direction.REVERSE);
        rbDrive.setDirection(DcMotor.Direction.FORWARD);
        lfDrive.setDirection(DcMotor.Direction.REVERSE);
        rfDrive.setDirection(DcMotor.Direction.FORWARD);

        // Set all motors to zero power
        lbDrive.setPower(0);
        rbDrive.setPower(0);
        lfDrive.setPower(0);
        rfDrive.setPower(0);

        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        lbDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rbDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        lfDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rfDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        lbDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rbDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        lfDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rfDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // Define and initialize ALL installed servos.
        lclaw = hwMap.get(Servo.class, "claw1");
        rcalw = hwMap.get(Servo.class, "claw2");
    }
}


