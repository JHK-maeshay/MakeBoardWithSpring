package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generates ID automatically based on the selected strategy
    private Long boardId;
    private String title;
    private String contentt;
    
    //NoArgsConstructor
    public Board() {
    }
    
    //Getter&Setter
    //boardId
    public Long getBoardId() {
        return boardId;
    }
    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }
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