public class FireAlarm implements Observer {

    /**
     * Constructor of FireAlarm associate to a SmokeDetecor
     * @param smokeDetector
     */
    public FireAlarm(SmokeDetector smokeDetector) {
        smokeDetector.registerObserver(this);
    }

    @Override
    public void recieveEvent(Event event) {
        if (event.getEventType() == "Alert") {
            System.err.println(event.toString());
            lunchAlarm();
        }
    }

    public void lunchAlarm() {
        System.err.println("Bip Bip Bip...");
    }
}
