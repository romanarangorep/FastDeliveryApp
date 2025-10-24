package Model.Exception;

/*
 * Customized exception to reprecent incidents in the cloth size exception
 */

public class InvalidSizeException extends Exception{
    public InvalidSizeException(String errorMessage){
        super(errorMessage);
    }

}
