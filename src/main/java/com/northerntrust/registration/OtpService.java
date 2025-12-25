package com.northerntrust.registration;

import org.springframework.stereotype.Service;

@Service
public class OtpService {
    public void sendOtp(String email) {
        // Logic to send OTP via Email or SMS
        System.out.println("Sending OTP to: " + email);
        // Integrate with Twilio or SendGrid here
    }
}