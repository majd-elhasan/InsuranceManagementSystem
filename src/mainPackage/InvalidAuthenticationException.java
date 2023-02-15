package mainPackage;

public class InvalidAuthenticationException extends RuntimeException{
    public InvalidAuthenticationException(String msg){
        super(msg);
    }
}
