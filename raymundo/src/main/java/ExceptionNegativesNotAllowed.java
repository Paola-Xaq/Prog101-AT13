public class ExceptionNegativesNotAllowed extends RuntimeException {
    public ExceptionNegativesNotAllowed() {
        this(" ");
    }

    public ExceptionNegativesNotAllowed(String string) {
        super(string + "Negatives not allowed.");
    }
}
