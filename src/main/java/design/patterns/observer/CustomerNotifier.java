package design.patterns.observer;

public class CustomerNotifier implements OrderPlacedSubscriber{

    public CustomerNotifier(){
        Amazon.getInstance().subscriberOrderPlacedNotifiers(this);
    }

    @Override
    public void orderPlacedEvent() {
    }
}
