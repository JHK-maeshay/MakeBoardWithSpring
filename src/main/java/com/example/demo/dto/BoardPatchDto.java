package com.example.demo.dto;

import jakarta.validation.constraints.NotEmpty;

public class BoardPatchDto {
    @NotEmpty
    private String title;
    @NotEmpty
    private String contentt;

    //=========================
    //getter & setter
    //=========================
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
    //getter & setter END
}
