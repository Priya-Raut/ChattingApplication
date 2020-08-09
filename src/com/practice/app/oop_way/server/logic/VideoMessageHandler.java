package com.practice.app.oop_way.server.logic;

import com.practice.app.oop_way.server.data.Message;

public class VideoMessageHandler implements MessageHandler {
    @Override
    public boolean sendMessage(Message message) {

        return false;
    }

    @Override
    public boolean receiveMessage(Message message) {

        return false;
    }
}
