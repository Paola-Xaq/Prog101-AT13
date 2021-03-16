public class ExceptionNegativesNotAllowed extends Exception {
    public ExceptionNegativesNotAllowed() {
        this(" ");
    }

    public ExceptionNegativesNotAllowed(String string) {
        super(string + "Negatives not allowed.");
    }
}
