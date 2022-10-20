public class SmokeDetectorEvent extends Event {

    public SmokeDetectorEvent(String eventType, String eventMessage) {
        super(eventType, eventMessage);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Static method to generate an "Alert" event
     * @param eventMessage
     * @return SmokeDetectorEvent
     */
    static SmokeDetectorEvent createAlertEvent(String eventMessage) {
        SmokeDetectorEvent alertEvent = new SmokeDetectorEvent("Alert", eventMessage);
        return alertEvent;
    }

}
