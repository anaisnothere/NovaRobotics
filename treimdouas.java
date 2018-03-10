package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "3m2s")
@Disabled
public class treimdouas extends LinearOpMode {

    //joystick 3 motoare 2 servo-uri

    // aici declari variabile
    DcMotor left_back_drive;
    DcMotor right_back_drive;
    DcMotor left_front_drive;
    DcMotor right_front_drive;
    Servo servo1;
    Servo servo2;

    @Override
    public void runOpMode() {

        // aici contorizezi numele variabilelor cu cele din telefon
        left_back_drive  = hardwareMap.get(DcMotor.class, "lb");
        right_back_drive = hardwareMap.get(DcMotor.class, "rb");
        left_front_drive  = hardwareMap.get(DcMotor.class, "lf");
        right_front_drive = hardwareMap.get(DcMotor.class, "rf");
       // servo1     = hardwareMap.get(Servo.class, "servo1");
      //  servo2     = hardwareMap.get(Servo.class, "servo2");
       // double left;
        //double right;
      //  double drive;
        //double turn;
        //double max;

        waitForStart();

        while (opModeIsActive()) {
            // aici dai comenzile de movement
            if(gamepad1.dpad_up){
                left_front_drive.setPower(-1);
                right_front_drive.setPower(1);
                left_back_drive.setPower(-1);
                right_back_drive.setPower(1);
            }
            else{
                left_front_drive.setPower(0);
                right_front_drive.setPower(0);
                left_back_drive.setPower(0);
                right_back_drive.setPower(0);
            }

            if(gamepad1.dpad_down){
                left_front_drive.setPower(1);
                right_front_drive.setPower(-1);
                left_back_drive.setPower(1);
                right_back_drive.setPower(-1);
            }
            else{
                left_front_drive.setPower(0);
                right_front_drive.setPower(0);
                left_back_drive.setPower(0);
                right_back_drive.setPower(0);
            }

            if(gamepad1.dpad_right){
                left_front_drive.setPower(1);
                right_front_drive.setPower(0);
                left_back_drive.setPower(1);
                right_back_drive.setPower(0);
            }
            else{
                left_front_drive.setPower(0);
                right_front_drive.setPower(0);
                left_back_drive.setPower(0);
                right_back_drive.setPower(0);}


            if(gamepad1.dpad_left) {
                left_front_drive.setPower(0);
                right_front_drive.setPower(1);
                left_back_drive.setPower(0);
                right_back_drive.setPower(1);
            }
            else{
                left_front_drive.setPower(0);
                right_front_drive.setPower(0);
                left_back_drive.setPower(0);
                right_back_drive.setPower(0);
            }


          /*  if(gamepad1.x){
                servo1.setPosition(0.85);
            }else{
                servo1.setPosition(0);
            }
            if(gamepad1.y){
                servo2.setPosition(0);
            }else {
                servo2.setPosition(0.85);
            }*/

         /*   if (gamepad1.a){
                armDrive.setPower(0.2);
            }else if (gamepad1.b){
                armDrive.setPower(-0.2);
            }
            else if(gamepad1.dpad_right) {
                armDrive.setPower(0);
            }
            */

        //  armDrive.setPower(gamepad1.left_trigger);
       /*     while(gamepad1.right_bumper){
                armDrive.setPower(1);
            }
            while(gamepad1.left_bumper){
                armDrive.setPower(-1);
            }*/
        }
    }
}