package com.practice.app.oop_way.client;

import com.practice.app.oop_way.server.data.Message;
import com.practice.app.oop_way.server.data.TextMessage;
import com.practice.app.oop_way.server.logic.MessageHandler;
import com.practice.app.oop_way.server.logic.TextMessageHandler;

public class AndroidClientSimulator{
    //create a message
    private Message createTextMessage(String content, String sender, String receiver){
        TextMessage message = new TextMessage();
        message.setTextMessageContent(content); /* Attribute from TextMessage */
        message.setSenderName(sender); /* Attribute inherited from Message */
        message.setReceiverName(receiver); /* Attribute inherited from Message */
        return message;
    }

    public static void main(String[] args) {
        AndroidClientSimulator androidClientSimulator = new AndroidClientSimulator();
        Message message = androidClientSimulator.createTextMessage("Hi there, how are you doing?", "Bob", "Alice");
        MessageHandler handler = new TextMessageHandler();
        /* The client only knows about input and output of sendMessage method aka abstraction.
           Internally, each message based on its type, text, video, audio, is sent differently.
         */
        boolean result = handler.sendMessage(message);
        if(result) System.out.println("Message has been delivered successfully.");
    }
}