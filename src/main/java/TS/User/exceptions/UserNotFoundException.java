package TS.User.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String text){
        super(text);
    }
}
