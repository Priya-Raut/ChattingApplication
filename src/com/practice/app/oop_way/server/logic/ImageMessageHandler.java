package com.practice.app.oop_way.server.logic;

import com.practice.app.oop_way.server.data.Message;

public class ImageMessageHandler implements MessageHandler {
    @Override
    public boolean sendMessage(Message message) {
        System.out.println("chile");
        return false;
    }

    @Override
    public boolean receiveMessage(Message message) {

        return false;
    }
}