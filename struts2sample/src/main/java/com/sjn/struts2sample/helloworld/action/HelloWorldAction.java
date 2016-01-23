package com.sjn.struts2sample.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sjn.struts2sample.helloworld.model.MessageStore;

public class HelloWorldAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private MessageStore messageStore;

    public String execute() throws Exception {

        messageStore = new MessageStore();
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
}
