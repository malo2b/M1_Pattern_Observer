import java.util.ArrayList;

public class SmokeDetector {

    private ArrayList<Observer> eventSubscribers = new ArrayList<>();

    private void notifyObserver(SmokeDetectorEvent event) {
        eventSubscribers.forEach(subscriber -> subscriber.recieveEvent(event));
    }

    public void registerObserver(Observer observer) {
        eventSubscribers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        eventSubscribers.remove(observer);
    }

    public void addEvent(SmokeDetectorEvent event) {
        notifyObserver(event);
    }

}
