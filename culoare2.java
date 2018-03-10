package org.firstinspires.ftc.teamcode.senzori;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;


@TeleOp(name = "Color", group = "Senzor")
@Disabled
public class culoare2 extends LinearOpMode {

    ColorSensor color_sensor;

    @Override
    public void runOpMode() {

        color_sensor = hardwareMap.get(ColorSensor.class, "color");
        color_sensor.enableLed(true);

        while (opModeIsActive()) {
            color_sensor.red();   // Red channel value
            color_sensor.green(); // Green channel value
            color_sensor.blue();  // Blue channel value

        }

    }
}
