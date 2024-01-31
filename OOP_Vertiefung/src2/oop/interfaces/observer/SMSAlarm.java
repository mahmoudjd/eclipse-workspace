package oop.interfaces.observer;

public class SMSAlarm implements ChangeObserver
{
    public void valueHasChanged(int oldValue, int newValue)
    {
        System.out.println("�nderung von " + oldValue + " zu " + newValue + " wird in Form einer SMS geschickt");
    }
}
