package com.fileproject.FileApp.model;

public class File {

    private String id;
    private String content;


    public File(String id, String content) {

        this.id = id;
        this.content = content;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
}
