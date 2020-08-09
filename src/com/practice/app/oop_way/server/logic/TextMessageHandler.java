package com.practice.app.oop_way.server.logic;

import com.practice.app.oop_way.server.data.Message;

public class TextMessageHandler implements MessageHandler {
    private boolean isOffensiveContent(Message message){
        /*
         Some logic to test if video contains offensive content
        */
        return false;
    }

    private void storeInDatabase(Message message){
        /*
        Some logic to store text in object store
        */
    }

    @Override
    public boolean sendMessage(Message message) { /* Dynamic Polymorphism */
        isOffensiveContent(message);
        storeInDatabase(message);
        return false;
    }

    @Override
    public boolean receiveMessage(Message message) { /* Dynamic Polymorphism */
        return false;
    }
}
