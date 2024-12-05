package Subscribtions.Subscribers;

import Subscribtions.Events.EventFunction;
import Subscribtions.Notifiers.SmsNotifier;
import User.UserType;

public class SmsSubscriber implements Subscriber {
    private final SmsNotifier smsNotifier;
    private final String phoneNumber;

    public SmsSubscriber(SmsNotifier smsNotifier, String phoneNumber) {
        this.smsNotifier = smsNotifier;
        this.phoneNumber = phoneNumber;
    }

    public void update(EventFunction eventFunction, UserType user)
    {
        smsNotifier.sendSms(phoneNumber, "Event triggered for user: " + user);
    }
}

