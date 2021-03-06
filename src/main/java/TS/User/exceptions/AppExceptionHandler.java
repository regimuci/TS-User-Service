package TS.User.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<String> handleUserException(UserNotFoundException exception){
        return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = UserExistException.class)
    public ResponseEntity<String> handleUserException(UserExistException exception){
        return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = GroupNotFoundException.class)
    public ResponseEntity<String> handleUserException(GroupNotFoundException exception){
        return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = TaskNotFoundException.class)
    public ResponseEntity<String> handleUserException(TaskNotFoundException exception){
        return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = PasswordNotMatchException.class)
    public ResponseEntity<String> handleUserException(PasswordNotMatchException exception){
        return new ResponseEntity<String>(exception.getMessage(),HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(value = CommentNotExistException.class)
    public ResponseEntity<String> handleUserException(CommentNotExistException exception){
        return new ResponseEntity<String>(exception.getMessage(),HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(value = StatusErrorException.class)
    public ResponseEntity<String> handleUserException(StatusErrorException exception){
        return new ResponseEntity<String>(exception.getMessage(),HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = UnauthorizedException.class)
    public ResponseEntity<String> handleUserException(UnauthorizedException exception){
        return new ResponseEntity<String>(exception.getMessage(),HttpStatus.UNAUTHORIZED);
    }

}
