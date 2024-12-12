package Subscribtions.Subscribers;

import Subscribtions.Events.EventType;
import User.UserType;

public interface Subscriber
{
    void update(EventType eventFunction, UserType user);
}