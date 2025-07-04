package com.example.demo.dto;

import com.example.demo.entity.Board;

public class BoardResponseDto {

	private Long boardId;
    private String title;
    private String contentt;
    
    //NoArgsConstructor
    public BoardResponseDto(Long boardId, String title, String contentt) {
        this.boardId = boardId;
        this.title = title;
        this.contentt = contentt;
    }
    
	//Getter&Setter
    //boardID
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
    //정적 팩토리 메서드 추가
    public static BoardResponseDto findFromBoard(Board board) {
        return new BoardResponseDto(
                board.getBoardId(),
                board.getTitle(),
                board.getContentt()
        );
    }
}
