package Model.Exception;

/*
 * Customized exception to reprecent incidents in the warrantyException
 */

public class InvalidWarrantyException extends Exception{
    public InvalidWarrantyException(String errorMessage){
        super(errorMessage);
    }

}
