// An exception for queue-full errors

public class QueueFullException extends Exception {
    private static final long serialVersionUID = 1L;
    int size;

    QueueFullException(int s) { size = s;}

    public String toString() {
        return "\nQueue is full. Maximum size is " + size;
    }
}