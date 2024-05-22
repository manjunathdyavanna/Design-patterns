package design.patterns.observer;

public class DeliveryNotifier implements OrderPlacedSubscriber{

    public DeliveryNotifier(){
        Amazon.getInstance().subscriberOrderPlacedNotifiers(this);
    }

    @Override
    public void orderPlacedEvent() {

    }
}
