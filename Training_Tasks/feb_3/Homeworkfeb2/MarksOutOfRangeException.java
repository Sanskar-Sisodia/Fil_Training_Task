public class MarksOutOfRangeException extends Exception
{
    public MarksOutOfRangeException() {
        super("Marks should be between 0 and 100.");
    }
}