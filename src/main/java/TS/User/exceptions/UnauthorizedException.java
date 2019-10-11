package TS.User.exceptions;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String text){
        super(text);
    }
}
