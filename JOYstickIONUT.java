package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="JOYstickIonut")
public class JOYstickIONUT extends LinearOpMode{
    DcMotor left_back_drive;
    DcMotor right_back_drive;
    DcMotor left_front_drive;
    DcMotor right_front_drive;
    DcMotor arm_drive;
    Servo servo1;
    Servo servo2;
 //   float fata = gamepad1.left_stick_y;
    //float spate = -gamepad1.left_stick_y;
   // float left = -gamepad1.left_stick_y;
  //  float right = gamepad1.right_stick_y;
    //double drive;
    //double turn;
  //  double max;
   // double left;
  //  double right;


    double equaliz(double input) {
        return Math.signum(input) * Math.pow(Math.abs(input), 2 );
    }

    @Override
    public void runOpMode() {

        left_back_drive  = hardwareMap.get(DcMotor.class, "lb");
        left_front_drive  = hardwareMap.get(DcMotor.class, "lf");
        right_back_drive = hardwareMap.get(DcMotor.class, "rb");
        right_front_drive = hardwareMap.get(DcMotor.class, "rf");
        arm_drive   = hardwareMap.get(DcMotor.class, "glis");
        servo1      = hardwareMap.get(Servo.class, "s1");
        servo2      = hardwareMap.get(Servo.class, "s2");

        left_back_drive.setDirection(DcMotor.Direction.FORWARD);
        left_front_drive.setDirection(DcMotor.Direction.FORWARD);
        right_back_drive.setDirection((DcMotor.Direction.REVERSE));
        right_front_drive.setDirection(DcMotor.Direction.FORWARD);

        waitForStart();


        while (opModeIsActive()) {
            double lb;
            double lf;
            double rb;
            double rf;

            double drive = -gamepad1.right_stick_y;
            double slide =  -gamepad1.left_stick_y;
            double rotation = -gamepad1.right_stick_x;


            double A = Math.abs(rotation) + Math.abs(drive) + Math.abs(slide);

            if (A <= 1) {
                lb = rotation - drive - slide;
                lf = rotation + drive - slide;
                rb = rotation + drive + slide;
                rf = rotation - drive + slide;
            } else {

                rotation = rotation / A;
                drive = drive / A;
                slide = slide / A;
                lb = rotation - drive - slide;
                lf = rotation + drive - slide;
                rb = rotation + drive + slide;
                rf = rotation - drive + slide;
            }

            left_back_drive.setPower(equaliz(lb));
            left_front_drive.setPower(equaliz(lf));
            right_back_drive.setPower(equaliz(rb));
            right_front_drive.setPower(equaliz(rf));

            servo2.setDirection(Servo.Direction.REVERSE);

            if(gamepad1.x){
                servo1.setPosition(0);
                servo2.setPosition(0);
            }
            if(gamepad1.b){
                servo1.setPosition(0.8); //stanga
                servo2.setPosition(0.8);
            }
            if(gamepad1.a){
                servo1.setPosition(0.42);
                servo2.setPosition(0.42);
            }



            if(gamepad1.right_bumper){
                arm_drive.setPower(0.45);
            }
            else if(gamepad1.left_bumper){
                arm_drive.setPower(-0.45);
            }
            else{
                arm_drive.setPower(0);
            }

        }
    }
}
