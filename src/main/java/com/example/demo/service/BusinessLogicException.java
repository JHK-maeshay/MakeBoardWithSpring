package com.example.demo.service;

import com.example.demo.service.BoardService.ExceptionCode;

//findBoardId 예외처리클래스
public class BusinessLogicException extends RuntimeException{

    private ExceptionCode exceptionCode;
    //getter
    public ExceptionCode getExceptionCode() {
        return exceptionCode;
    }


    public BusinessLogicException(ExceptionCode exceptionCode) {
        super(exceptionCode.getMessage());
        this.exceptionCode = exceptionCode;
    }
}
