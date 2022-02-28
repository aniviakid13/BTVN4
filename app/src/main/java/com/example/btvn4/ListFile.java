package com.example.btvn4;

public class ListFile {
    private int file;
    private String filename;

    public ListFile(int file, String filename) {
        this.file = file;
        this.filename = filename;
    }

    public ListFile() {
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
