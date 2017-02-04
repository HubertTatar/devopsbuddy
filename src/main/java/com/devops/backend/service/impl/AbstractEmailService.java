package com.devops.backend.service.impl;

import com.devops.backend.service.EmailService;
import com.devops.web.domain.frontend.Feedback;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

public abstract class AbstractEmailService implements EmailService {

    @Value("${default.to.address}")
    private String defaultAdrress;

    protected SimpleMailMessage prepareSimpleMailMessageFromFeeback(Feedback feedback) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(defaultAdrress);
        msg.setFrom(feedback.getEmail());
        msg.setSubject("[TEST] - app");
        msg.setText("test");
        return msg;
    }

    @Override
    public void sendFeedbackEmail(Feedback feedback) {
        sendGenericEmailMessage(prepareSimpleMailMessageFromFeeback(feedback));
    }
}
