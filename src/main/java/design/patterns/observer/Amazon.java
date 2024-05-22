package design.patterns.observer;

import java.util.HashSet;

public class Amazon {
    private HashSet<OrderPlacedSubscriber> subscribers;
    private static volatile Amazon instance;

    private Amazon(){
    }

    public static Amazon getInstance(){
        if(instance == null){
            synchronized (Amazon.class){
                if(instance == null){
                    instance = new Amazon();
                    instance.subscribers = new HashSet<>();
                }
            }
        }
        return instance;
    }

    public void unSubscriberOrderPlacedNotifiers(OrderPlacedSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void subscriberOrderPlacedNotifiers(OrderPlacedSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void publish(){
        for(OrderPlacedSubscriber subscriber : subscribers){
            subscriber.orderPlacedEvent();
        }
    }
}
