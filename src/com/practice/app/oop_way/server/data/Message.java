package com.practice.app.oop_way.server.data;

import java.util.Date;

/*
Message class follows principles of encapsulation.
All attributes are private i.e encapsulated/hidden from outside world.
All functions giving access to them are public.
 */
public abstract class Message {
    private long messageId;
    private String senderName;
    private String receiverName;
    private Date sendingTime;
    private Date receivingTime;
    private long messageSize;

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public Date getSendingTime() {
        return (Date) sendingTime.clone();
    }

    public void setSendingTime(Date sendingTime) {
        this.sendingTime = (Date) sendingTime.clone();
    }

    public Date getReceivingTime() {
        return (Date) receivingTime.clone();
    }

    public void setReceivingTime(Date receivingTime) {
        this.receivingTime = (Date) receivingTime.clone();
    }

    public long getMessageSize() {
        return messageSize;
    }

    public void setMessageSize(long messageSize) {
        this.messageSize = messageSize;
    }
}
