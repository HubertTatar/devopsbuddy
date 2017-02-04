package com.devops.web.domain.frontend;

import lombok.Data;

import java.io.Serializable;

@Data
public class Feedback implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String firstName;
    private String lastName;
    private String feedback;
    private String email;

}
