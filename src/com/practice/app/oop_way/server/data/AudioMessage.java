package com.practice.app.oop_way.server.data;

/**
 * AudioMessage class inherits attributes/function from Message class.
 */
public class AudioMessage extends Message{
    private int audioLengthInSeconds;
    private String audioFileName;

    public int getAudioLengthInSeconds() {
        return audioLengthInSeconds;
    }

    public void setAudioLengthInSeconds(int audioLengthInSeconds) {
        this.audioLengthInSeconds = audioLengthInSeconds;
    }

    public String getAudioFileName() {
        return audioFileName;
    }

    public void setAudioFileName(String audioFileName) {
        this.audioFileName = audioFileName;
    }
}
