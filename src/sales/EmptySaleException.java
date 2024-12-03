package sales;

/**
 * Custom exception for handling empty sales.
 */
public class EmptySaleException extends Exception {
    public EmptySaleException() {
        super("To make a sale you first have to add products.");
    }
}
