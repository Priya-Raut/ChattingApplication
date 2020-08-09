package com.practice.app.oop_way.server.data;

/**
 * ImageMessage class inherits attributes/function from Message class.
 */
public class ImageMessage extends Message {
    private String imageType;
    private String imageName;

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }
}
