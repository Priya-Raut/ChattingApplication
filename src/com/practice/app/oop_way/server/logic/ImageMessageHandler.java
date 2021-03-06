package com.practice.app.oop_way.server.logic;

import com.practice.app.oop_way.server.data.Message;

public class ImageMessageHandler implements MessageHandler {
    private boolean isOffensiveContent(Message message){
        /*
         Some logic to test if image contains offensive content
        */
        return false;
    }

    private void storeInObjectStore(Message message){
         /*
        Some logic to store image in object store
        */
    }

    @Override
    public boolean sendMessage(Message message) { /* Dynamic Polymorphism */
        isOffensiveContent(message);
        storeInObjectStore(message);
        return false;
    }

    @Override
    public boolean receiveMessage(Message message) { /* Dynamic Polymorphism */
        return false;
    }
}