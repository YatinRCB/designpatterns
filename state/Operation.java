public enum Operation {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    public final String label;

    private Operation(String label) {
        this.label = label;
    }
}
