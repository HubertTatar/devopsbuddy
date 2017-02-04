package com.devops.config;

import com.devops.backend.service.EmailService;
import com.devops.backend.service.impl.SMTPEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/.devopsbuddy/application-prod.properties")
public class ProductionConfig {

    @Bean
    public EmailService emailService() {
        return new SMTPEmailService();
    }
}
