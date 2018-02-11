package org.firstinspires.ftc.teamcode.senzori;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cRangeSensor;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.I2cAddr;
import com.qualcomm.robotcore.hardware.I2cDevice;
import com.qualcomm.robotcore.hardware.I2cDeviceSynch;
import com.qualcomm.robotcore.hardware.I2cDeviceSynchImpl;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

/*
(autonom cu ods ow daaa) <- eram bucuroasa pe atunci, abia incepusem =))))
practic el citeste valori iar daca valorile sunt mai mari de 0.6 trebuie sa se intoarca
iar daca valorile citite sunt mai mici de 0.6 e ok si merge in fata pana cand nu mai sunt
P.S. am folosit mai multe proceduri decat erau necesare dar e mai sexy asa heh
*/

@Autonomous(name = "Autonom cu Range Senzor")
public class autonomcurange extends LinearOpMode {
    //denumimi obiecte = (
    DcMotor left_drive;
    DcMotor right_drive;
    DcMotor arm_drive;
    Servo servo1;
    Servo servo2;
    ModernRoboticsI2cRangeSensor rangeSensor;
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() {
        //e o alta varianta de a denumi chestii din telefon, cam la fel dar pare mai simpla
        left_drive  = hardwareMap.get(DcMotor.class, "left_drive");
        right_drive = hardwareMap.get(DcMotor.class, "right_drive");
        rangeSensor = hardwareMap.get(ModernRoboticsI2cRangeSensor.class, "sensor_range");
        arm_drive   = hardwareMap.get(DcMotor.class, "arm_drive");
        servo1      = hardwareMap.get(Servo.class, "servo1");
        servo2      = hardwareMap.get(Servo.class, "servo2");

        waitForStart();
        runtime.reset();

        while (opModeIsActive()) {
            if(rangeSensor.getDistance(DistanceUnit.CM) < 40){
                walkForward();              //practic daca nu citeste prea multa lumina ii da inainte
            }
            else if(rangeSensor.getDistance(DistanceUnit.CM) > 40){
                walkBackwards();            //aici merge in spate 0.1s si apoi la dreapta 1s
                sleep(500);
                walkRight();
                sleep(1000);
                if(rangeSensor.getDistance(DistanceUnit.CM) < 40){
                    walkForward();         //citeste din nou valoarea si face cam aceleasi chestii
                }
                else if(rangeSensor.getDistance(DistanceUnit.CM) > 40){
                    walkLeft();            //merge stanga 2s, adica practic trece de la dreapta,
                    sleep(2000);           //la pozitia initiala si apoi la stanga
                    if (rangeSensor.getDistance(DistanceUnit.CM) < 40){
                        walkForward();     //same shit from now on
                    }
                    else if(rangeSensor.getDistance(DistanceUnit.CM) > 40){
                        walkLeft();
                        sleep(1000);
                    }
                    if (rangeSensor.getDistance(DistanceUnit.CM) < 40){
                        walkForward();
                    }
                }
            }
            else{
                taci();  //aici se opreste daca nimic altceva nu mai e valabil
            }
            telemetry.addData("cm", "%.2f cm", rangeSensor.getDistance(DistanceUnit.CM));
            telemetry.update();
        }
    }
    //astea-s procedurile, nimic complicat, doar motoare si valori (meh)
    public void walkForward() {
        left_drive.setPower(1);
        right_drive.setPower(-1);
    }
    public void walkBackwards(){
        left_drive.setPower(-1);
        right_drive.setPower(1);
    }
    public void walkRight(){
        left_drive.setPower(1);
        right_drive.setPower(0);
    }
    public void walkLeft(){
        left_drive.setPower(0);
        right_drive.setPower(1);
    }
    public void taci(){
        left_drive.setPower(0);
        right_drive.setPower(0);
    }
    public void apuca(){
        servo1.setPosition(1);
        servo2.setPosition(0);
    }
    public void nu(){
        servo2.setPosition(1);
        servo1.setPosition(0);
    }
    public void ridica(){
        arm_drive.setPower(.5);
    }
    public void lasa(){
        arm_drive.setPower(0);
    }





}