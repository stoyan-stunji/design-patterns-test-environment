package Subscribtions.Subscribers;

import Subscribtions.Events.EventFunction;
import Subscribtions.Notifiers.EmailNotifier;
import User.UserType;

public class EmailSubscriber implements Subscriber
{
    private final EmailNotifier emailNotifier;
    private final String email;

    public EmailSubscriber(EmailNotifier emailNotifier, String email) {
        this.emailNotifier = emailNotifier;
        this.email = email;
    }

    public void update(EventFunction eventFunction, UserType user)
    {
        emailNotifier.sendEmail(email, "Event Notification", "Event triggered for user: " + user);
    }
}
