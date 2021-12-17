public class NoWagonsInCompositionException extends RuntimeException {

    public NoWagonsInCompositionException(int id) {
        super("There are no wagons in composition with id:" + id);
    }
}