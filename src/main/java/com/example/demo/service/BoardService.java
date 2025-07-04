package com.example.demo.service;

import com.example.demo.dto.BoardPostDto;
import com.example.demo.dto.BoardResponseDto;
import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;

import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private final BoardRepository boardRepository;
    
    //RequiredArgsConstructor
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }
    
    //POST
    public Long createBoard(BoardPostDto boardPostDto) {
        Board board = new Board();
        board.setTitle(boardPostDto.getTitle());
        board.setContentt(boardPostDto.getContentt());

        return boardRepository.save(board).getBoardId();

    }
    
    //아이디검색
    public Board findBoardId(Long boardId) {
        return boardRepository.findById(boardId)
                .orElseThrow(()->new BusinessLogicException(ExceptionCode.BOARD_NOT_FOUND));
    }
    
    //findBoardId 예외처리메서드
    public enum ExceptionCode {
        BOARD_NOT_FOUND(400, "board not found");

        //getter status
        private int status;
        public int getStatus() {
        		return status;
        }
        //getter message
        private String message;
        public String getMessage() {
        		return message;
        }

        ExceptionCode(int status, String message) {
            this.status = status;
            this.message = message;
        }
    }
    
    //GET
    public BoardResponseDto findByBoardId(Long boardId) {

        Board board = findBoardId(boardId);
        return BoardResponseDto.findFromBoard(board);
    }
}