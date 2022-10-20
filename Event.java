public class Event {

    public Event(String eventType, String eventMessage) {
        this.eventType = eventType;
        this.eventMessage = eventMessage;
    }

    protected String eventType;
    protected String eventMessage;

    public String getEventType() {
        return eventType;
    }

    public String getEventMessage() {
        return eventMessage;
    }

    @Override
    public String toString() {
        return eventType + " ! " + eventMessage;
    }
}
