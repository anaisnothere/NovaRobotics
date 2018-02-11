package org.firstinspires.ftc.teamcode.DisabledOrOldCode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name="Ionut")
@Disabled
public class ionutafacutasta extends LinearOpMode {

    // Declarare.
    private double          MID_POINT        = 0.0 ;
    private final double    VITEZA_SERVO     = 0.02 ;
    private static final double MIJ_SERVO   =  0.5;
    private static final double SERVO_SUS    =  0.45 ;
    private static final double SERVO_JOS    = -0.45 ;
    private DcMotor motorUnu = null;
    private DcMotor motorDoi = null;
    private DcMotor motorServo = null;
    private Servo servoUnu = null;
    private Servo servoDoi = null;

    @Override

    public void runOpMode() {

        double left;
        double right;
        double drive;
        double turn;
        double max;

        motorUnu   = hardwareMap.get(DcMotor.class, "motor1");
        motorDoi   = hardwareMap.get(DcMotor.class, "motor2");
        motorServo = hardwareMap.get(DcMotor.class,"motorservo");
        servoUnu   = hardwareMap.get(Servo.class, "servo1");
        servoDoi   = hardwareMap.get(Servo.class, "servo2");

        telemetry.addData("ar treb", "sa functioneze");    //
        telemetry.update();
        waitForStart();

        while (opModeIsActive()) {
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

            motorUnu.setPower(left);
            motorDoi.setPower(right);

            // bumpere ptr a deschide claw
            if (gamepad1.right_bumper)
                MID_POINT += VITEZA_SERVO;
            else if (gamepad1.left_bumper)
                MID_POINT -= VITEZA_SERVO;

            //  map pentru refactor
            MID_POINT = Range.clip(MID_POINT, -0.5, 0.5);
            servoUnu.setPosition(MIJ_SERVO+ MID_POINT);
            servoDoi.setPosition(MIJ_SERVO- MID_POINT);

            //apelarea functiei pentru a ridica servo sus/jos (y sus; a jos)
            servoFunction(SERVO_SUS, SERVO_JOS);
            //apelarea functiei pentru date telemetrice

            telemetry(left, right);
            iostn(1);

            //resonable speed?
            sleep(50);

        }

    }


    public void servoFunction(double servo1, double servo2){
        if (gamepad1.y)
            motorServo.setPower(servo1);
        else if (gamepad1.a)
            motorServo.setPower(servo2);
        else
            motorServo.setPower(0.0);
    }

    public void telemetry(double tel1,double tel2){

        // avem nev de telemetrie?
        telemetry.addData("claw",  "Offset = %.2f", MIJ_SERVO);
        telemetry.addData("left",  "%.2f", tel1);
        telemetry.addData("right", "%.2f", tel2);
        telemetry.update();
    }


    // nu sterge asta, e ptr cod.
    public int iostn(int a){
        return a+0;

    }

}