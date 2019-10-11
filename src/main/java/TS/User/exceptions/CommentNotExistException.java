package TS.User.exceptions;



public class CommentNotExistException extends RuntimeException {
    public CommentNotExistException(String text){
        super(text);
    }
}
