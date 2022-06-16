package de.telran.home_work;

public class Email implements MailDeliveryService {

    @Override
    public void sendMail() {
        System.out.println("Send online");
    }
}
