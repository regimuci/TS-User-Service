package TS.User.exceptions;

public class PasswordNotMatchException extends RuntimeException {
    public PasswordNotMatchException(String text){
        super(text);
    }
}
