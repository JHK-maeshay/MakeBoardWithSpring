package com.example.demo.dto;

import jakarta.validation.constraints.NotEmpty;

public class BoardPostDto {

    @NotEmpty
    private String title;
    @NotEmpty
    private String contentt;
    
    //Getter&Setter
    //boardId is not require
    //title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    //contentt
    public String getContentt() {
        return contentt;
    }
    public void setContentt(String contentt) {
        this.contentt = contentt;
    }
}