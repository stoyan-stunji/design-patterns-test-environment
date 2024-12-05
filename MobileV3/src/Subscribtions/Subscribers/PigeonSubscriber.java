package Subscribtions.Subscribers;

import Subscribtions.Events.EventFunction;
import Subscribtions.Notifiers.PigeonNotifier;
import User.UserType;

public class PigeonSubscriber implements Subscriber
{
    private final PigeonNotifier pigeonNotifier;
    private final String address;
    private final Integer pigeonNumber;

    public PigeonSubscriber(PigeonNotifier pigeonNotifier, String address, Integer pigeonNumber) {
        this.pigeonNotifier = pigeonNotifier;
        this.address = address;
        this.pigeonNumber = pigeonNumber;
    }

    public void update(EventFunction eventFunction, UserType user)
    {
        pigeonNotifier.sendPigeon(address, pigeonNumber, "Event triggered for user: " + user);
    }
}

