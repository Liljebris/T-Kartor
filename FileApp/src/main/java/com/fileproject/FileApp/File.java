package com.fileproject.FileApp;

public class File {

    private String content;
    private String type;
    private String name;
    private String fileName;

    public File(String content, String type, String name) {

        this.content = content;
        this.type = type;
        this.name = name;
        this.fileName = name + type;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this. fileName = name + type;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this. fileName = name + type;
        this.name = name;
    }

    public String getFileName() {
        return this.content;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
}
