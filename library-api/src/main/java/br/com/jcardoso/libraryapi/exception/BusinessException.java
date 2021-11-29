package br.com.jcardoso.libraryapi.exception;

public class BusinessException extends RuntimeException {
    public BusinessException(String msg)
    {
        super(msg);
    }
}
