package com.northerntrust.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final OtpService otpService;

    @Autowired
    public UserService(UserRepository userRepository, OtpService otpService) {
        this.userRepository = userRepository;
        this.otpService = otpService;
    }

    public void registerUser(UserRegistrationRequest request) throws Exception {
        // Validate and save user
        User user = new User(request.getUsername(), request.getPassword(), request.getEmail());
        userRepository.save(user);
        otpService.sendOtp(user.getEmail()); // Send OTP for MFA
    }
}