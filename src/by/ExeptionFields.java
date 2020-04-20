package by;

public class ExeptionFields extends NoSuchFieldException{

        private static final long serialVersionUID = 1L;

    public ExeptionFields(String errorMessage) {
        super(errorMessage);
    }
}
