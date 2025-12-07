package com.dnai.dtos;


// 1. INPUT
public class EntryRequestDTO {
    private String title;
    private String body;
    private String tags; 

    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }
    public String getTags() { return tags; }
    public void setTags(String tags) { this.tags = tags; }
}

