package Model.Exception;

/*
 * Customized exception to reprecent incidents in the expired products exception
 */

public class ExpiredProductException extends Exception{
    public ExpiredProductException(String errorMessage){
        super(errorMessage);
    }

}
