package com.example.demo.service;

import com.example.demo.dto.BoardPostDto;
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

    public Long createBoard(BoardPostDto boardPostDto) {
        Board board = new Board();
        board.setTitle(boardPostDto.getTitle());
        board.setContentt(boardPostDto.getContentt());

        return boardRepository.save(board).getBoardId();

    }
}