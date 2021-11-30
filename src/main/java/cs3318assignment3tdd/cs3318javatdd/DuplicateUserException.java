package cs3318assignment3tdd.cs3318javatdd;

public class DuplicateUserException extends RuntimeException {
    public DuplicateUserException(String errorMessage, Throwable err) {
        super(errorMessage,err);
    }
}
