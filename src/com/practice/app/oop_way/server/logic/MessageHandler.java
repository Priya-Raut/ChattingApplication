package com.practice.app.oop_way.server.logic;

import com.practice.app.oop_way.server.data.Message;

public interface MessageHandler {
    /**
     * Send message.
     *
     * @param message message object to be sent.
     * @return true if message is sent, false otherwise.
     */
    boolean sendMessage(Message message); /* Abstraction! No complexities! Only input and output.*/

    /**
     * Receive message.
     *
     * @param message message object to be received
     * @return true if the message is received, false otherwise.
     */
    boolean receiveMessage(Message message); /* Abstraction! No complexities! Only input and output.*/

}
