package org.example;
import dev.resms.ReSMS;
import dev.resms.core.exception.ReSMSException;
import dev.resms.services.sms.model.SendSmsOptions;
import dev.resms.services.sms.model.SendSmsResponse;

public class Main {
    public static void main(String[] args) {
        ReSMS reSms = new ReSMS("your_api_key");

        SendSmsOptions smsOptions =
                SendSmsOptions.builder()
                        .to("+33787195650")
                        .message("Welcome to ReSMS!")
                        .build();

        try {
            SendSmsResponse response = reSms.sms().send(smsOptions);
            System.out.println(response.getStatus());
        } catch (ReSMSException e) {
            e.printStackTrace();
        }
    }
}
