package TS.User.exceptions;

public class StatusErrorException extends RuntimeException {
    public StatusErrorException(String text){
        super(text);
    }
}
