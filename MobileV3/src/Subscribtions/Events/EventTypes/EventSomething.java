package Subscribtions.Events.EventTypes;

import Subscribtions.Events.EventFunction;
import User.UserType;

public class EventSomething implements EventFunction
{
    public void execute(UserType user)
    {
        System.out.println("Notification event executed for user: " + user);
    }
}
