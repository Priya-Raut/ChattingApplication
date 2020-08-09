package com.practice.app.oop_way.server.data;

/**
 * TextMessage class inherits attributes/function from Message class.
 */
public class TextMessage extends Message{
    private String textMessageContent;

    public String getTextMessageContent() {
        return textMessageContent;
    }

    public void setTextMessageContent(String textMessageContent) {
        this.textMessageContent = textMessageContent;
    }
}
