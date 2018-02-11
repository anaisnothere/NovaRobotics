package org.firstinspires.ftc.teamcode.senzori;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;

//eezy ods program learned from the ftc tutorials ayy
@TeleOp(name = "ODS", group = "Senzor")
@Disabled
public class ODS extends LinearOpMode {
  //declaram senzorul
  OpticalDistanceSensor ods;
    DcMotor left_drive;
    DcMotor right_drive;
    double drive;
    double turn;
    double max;
    double left;
    double right;

  @Override
  public void runOpMode() {
    //le punem denumirea din telefon si pornim led-ul
    ods = hardwareMap.opticalDistanceSensor.get("ods");
      left_drive  = hardwareMap.get(DcMotor.class, "left_drive");
      right_drive = hardwareMap.get(DcMotor.class, "right_drive");
    ods.enableLed(true);

    waitForStart();

    while (opModeIsActive()) {
        //aici scrie pe telefon valorile citite de senzor
        drive = -gamepad1.left_stick_y;
        turn  = gamepad1.right_stick_x;
        left  = drive + turn;
        right = drive - turn;

        // asta e luat de pe net =))
        max = Math.max(Math.abs(left),Math.abs(right));
        if (max > 1.0) {
            left /= max;
            right /= max;
        }

        left_drive.setPower(left/2);
        right_drive.setPower(right/2);
      telemetry.addData("Light Detected: ", ods.getLightDetected());
      telemetry.update();
    }
  }
}
