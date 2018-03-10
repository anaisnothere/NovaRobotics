package org.firstinspires.ftc.teamcode;

import android.graphics.Color;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cColorSensor;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Ana on 2/11/2018.
 */

public class hardware {

    public DcMotor lbDrive = null;
    public DcMotor rbDrive = null;
    public DcMotor lfDrive = null;
    public DcMotor rfDrive = null;
    public DcMotor armDrive = null;
    public Servo sl = null;
    public Servo sr = null;
    //public Servo   sb        = null;
    public CRServo cr = null;
    public ColorSensor colorSensor;

    /* local OpMode members. */
    HardwareMap hwMap;
//    private ElapsedTime period = new ElapsedTime();

    public void Hardware() {

    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        colorSensor = hwMap.get(ColorSensor.class, "color");
        colorSensor.enableLed(false);
        // Define and Initialize Motors
        lbDrive = hwMap.get(DcMotor.class, "lb");
        rbDrive = hwMap.get(DcMotor.class, "rb");
        lfDrive = hwMap.get(DcMotor.class, "lf");
        rfDrive = hwMap.get(DcMotor.class, "rf");
        armDrive = hwMap.get(DcMotor.class, "glis");

        lbDrive.setDirection(DcMotor.Direction.FORWARD);
        lfDrive.setDirection(DcMotor.Direction.REVERSE);
        rbDrive.setDirection((DcMotor.Direction.REVERSE));
        rfDrive.setDirection(DcMotor.Direction.FORWARD);

        armDrive.setDirection(DcMotor.Direction.FORWARD);

        // Set all motors to zero power
        lbDrive.setPower(0);
        rbDrive.setPower(0);
        lfDrive.setPower(0);
        rfDrive.setPower(0);
        armDrive.setPower(0);

        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        // lbDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //  rbDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //  lfDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        // rfDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //  armDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        // lbDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        // rbDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //  lfDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        // rfDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //armDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // Define and initialize ALL installed servos.
        sl = hwMap.get(Servo.class, "s1");
        sr = hwMap.get(Servo.class, "s2");
        //sb = hwMap.get(Servo.class, "s3");
        cr = hwMap.crservo.get("crservo");
        cr.setPower(0);


        sr.setDirection(Servo.Direction.REVERSE);
        //sb.setPosition(1); //!!!!!!!!


    }
}


