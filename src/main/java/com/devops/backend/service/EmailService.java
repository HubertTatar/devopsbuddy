package com.devops.backend.service;

import com.devops.web.domain.frontend.Feedback;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    void sendFeedbackEmail(Feedback feedback);
    void sendGenericEmailMessage(SimpleMailMessage message);
}
