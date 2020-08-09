package com.practice.app.oop_way.server.data;

/**
 * VideoMessage class inherits attributes/function from Message class.
 */
public class VideoMessage extends Message{
    private int videoLengthInSeconds;
    private String videoFileName;

    public int getVideoLengthInSeconds() {
        return videoLengthInSeconds;
    }

    public void setVideoLengthInSeconds(int videoLengthInSeconds) {
        this.videoLengthInSeconds = videoLengthInSeconds;
    }

    public String getVideoFileName() {
        return videoFileName;
    }

    public void setVideoFileName(String videoFileName) {
        this.videoFileName = videoFileName;
    }
}
