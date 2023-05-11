package Chwilowe;

public class MniejNizZero extends Exception {
    public MniejNizZero() {
    }

    public MniejNizZero(String message) {
        super(message);
    }

    public MniejNizZero(String message, Throwable cause) {
        super(message, cause);
    }
}
