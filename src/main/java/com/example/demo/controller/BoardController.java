package com.example.demo.controller;

import com.example.demo.dto.BoardPostDto;
import com.example.demo.dto.BoardResponseDto;
import com.example.demo.service.BoardService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/boards")
public class BoardController {

    private final BoardService boardService;
    
    //RequiredArgsConstructor
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping
    public ResponseEntity<Long> postBoard(@RequestBody @Validated BoardPostDto boardPostDto) {
        Long boardId = boardService.createBoard(boardPostDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(boardId);
    }
    
    @GetMapping("/{boardId}")
    public ResponseEntity getBoard(@PathVariable("boardId") Long boardId) {
        BoardResponseDto boardResponseDto = boardService.findByBoardId(boardId);
        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }
}
