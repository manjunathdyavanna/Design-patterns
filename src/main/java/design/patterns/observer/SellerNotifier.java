package design.patterns.observer;

public class SellerNotifier implements OrderPlacedSubscriber{

    public SellerNotifier(){
        Amazon.getInstance().subscriberOrderPlacedNotifiers(this);
    }

    @Override
    public void orderPlacedEvent() {

    }
}
