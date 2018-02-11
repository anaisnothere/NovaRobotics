package org.firstinspires.ftc.teamcode.senzori;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

//doar merge in fata daca e butonul apasat, e ok, nimic prea complicat
@TeleOp(name = "Sensor: Digital touch", group = "Senzor")
@Disabled
public class APASAREautonom extends LinearOpMode {
    //declaram obiecte

    TouchSensor touch;
    DcMotor left_motor;
    DcMotor right_motor;

    @Override
    public void runOpMode() {
        //denumirile din telefon si spunem ca senzorul are input, idfk de ce dar pare legit

        touch        = hardwareMap.touchSensor.get("touch");
        left_motor   = hardwareMap.dcMotor.get("left_motor");
        right_motor  = hardwareMap.dcMotor.get("right_motor");
        waitForStart();

        while (opModeIsActive()) {

            if(!touch.isPressed()){ //spune ca poate fi simplificata chestia dar in toate exemplele asa aparea deci habar n-am
                //butonul e apasat, robotul merge in fata
                left_motor.setPower(1);
                right_motor.setPower(-1);
                telemetry.addData("Butonul", "e apasat");
            }
            else{
                //butonul nu e apasat, robotul se opreste
                left_motor.setPower(0);
                right_motor.setPower(0);
                telemetry.addData("Butonul", "nu e apasat");
            }

        }
    }

}
