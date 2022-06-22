package com.fileproject.FileApp.model;

public class File {

    private String content;
    private String type;
    private String name;
    private String filename;

    public File(String content, String type, String name) {

        this.content = content;
        this.type = type;
        this.name = name;
        this.filename = name + "." + type;
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
        this. filename = this.name + "." + type;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.filename = name + "." + this.type;
        this.name = name;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    
}
