package bank;

public class InvalidAccountDetailsException extends Throwable {
    public InvalidAccountDetailsException(String message){
        super(message);
    }
}
