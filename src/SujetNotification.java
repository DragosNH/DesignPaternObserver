import java.util.ArrayList;
import java.util.List;

public class SujetNotification implements IObserver {
    private User addSubscriber;
    private User deleteSubscirber;
    private String notification;
    private List<IObserver> observers;

    public SujetNotification() {
        observers = new ArrayList<>();
    }

    public void add(IObserver o) {
        observers.add(o);
    }

    public void remove(IObserver o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(notification);
        }
    }

    public void setAddSubscriber(User addSubscriber) {
        this.addSubscriber = addSubscriber;
        notifyObservers();
    }

    @Override
    public void update(String notification) {

    }
}
