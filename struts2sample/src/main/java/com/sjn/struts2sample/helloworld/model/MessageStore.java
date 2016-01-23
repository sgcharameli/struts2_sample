package com.sjn.struts2sample.helloworld.model;

import java.io.Serializable;

public class MessageStore implements Serializable {

    private String message;

    public MessageStore() {

        setMessage("Hello Struts User");
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }
}
