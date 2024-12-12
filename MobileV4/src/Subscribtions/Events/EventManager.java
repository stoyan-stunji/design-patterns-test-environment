package Subscribtions.Events;

import Listings.Listing;
import Subscribtions.Subscribers.Subscriber;
import User.UserType;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class EventManager
{
    private final Map<EventType, List<Subscriber>> subscribers = new HashMap<>();

    public void subscribe(EventType eventFunction, Subscriber subscriber)
    {
        subscribers.computeIfAbsent(eventFunction, k -> new ArrayList<>()).add(subscriber);
    }

    public void unsubscribe(EventType eventFunction, Subscriber subscriber)
    {
        List<Subscriber> subs = subscribers.get(eventFunction);

        if (subs != null)
        {
            subs.remove(subscriber);
        }
    }

    public void publish(EventType eventFunction, Listing listing, UserType user)
    {
        List<Subscriber> subs = subscribers.get(eventFunction);

        if (subs != null)
        {
            for (Subscriber subscriber : subs)
            {
                subscriber.update(eventFunction, user);
            }
        }
    }
}
