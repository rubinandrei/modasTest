package by;

public class TestException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public TestException(String errorMessage) {
        super(errorMessage);
    }
}
