package polymorphism;

class Notification{
    public void send(){
        System.out.println("Sending Notification");
    }
}
class EmailNotification extends Notification{

    @Override
    public void send(){
        System.out.println("sending.. Email Notification");
    }
}
class SmsNotification extends Notification{

    @Override
    public void send(){
        System.out.println("sending.. SMS Notification");
    }
}
class PushNotification extends Notification{

    @Override
    public void send(){
        System.out.println("sending.. Push Notification");
    }
}

public class Device {
    public static void main(String[] args){
        Notification[] notif = {new EmailNotification(), new SmsNotification(), new PushNotification()};
        for (int i=0;i<notif.length;i++){
            notif[i].send();
        }
    }
}
