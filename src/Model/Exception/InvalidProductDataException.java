package Model.Exception;

/*
 * Customized exception to reprecent incidents in the Products info
 */

public class InvalidProductDataException extends Exception {

    public InvalidProductDataException(String errormessage){
        super(errormessage);
    }

}
