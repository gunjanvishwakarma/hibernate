package com.gunjan;

public class Image {
    private String fileName;

    public Image() {
        super();
    }

    public Image(String fileName) {
        super();
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Image [fileName=" + fileName + "]";
    }

}
