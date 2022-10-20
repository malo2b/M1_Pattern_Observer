import java.util.concurrent.TimeUnit;

public class main {

    public static void main(String[] args) throws InterruptedException {
        SmokeDetector detector1 = new SmokeDetector();
        FireAlarm alarm1 = new FireAlarm(detector1);
        AutomaticFireExtinguisher fireExtinguisher1 = new AutomaticFireExtinguisher(detector1);

        SmokeDetectorEvent alertEvent = SmokeDetectorEvent.createAlertEvent("Fire fire");

        TimeUnit.SECONDS.sleep(2);

        System.out.println("A fire breaks out and is detected by the detector1");
        detector1.addEvent(alertEvent);

        detector1.unregisterObserver(fireExtinguisher1);

        TimeUnit.SECONDS.sleep(2);

        detector1.addEvent(alertEvent);

    }

}
