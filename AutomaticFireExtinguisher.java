public class AutomaticFireExtinguisher implements Observer {

    /**
     * Constructor of AutomaticFireExtinguisher associate to a SmokeDetecor
     * @param smokeDetector
     */
    public AutomaticFireExtinguisher(SmokeDetector smokeDetector) {
        smokeDetector.registerObserver(this);
    }

    @Override
    public void recieveEvent(Event event) {
        if (event.getEventType() == "Alert") {
            System.err.println(event);
            lunchAutomaticFireExtinguisher();
        }
    }

    public void lunchAutomaticFireExtinguisher() {
        System.err.println("💦🔫💦🔫💦🔫");
    }

}
