package validationofData;
import java.lang.*;
public class NonvalidEmailException extends RuntimeException {

  public NonvalidEmailException(){
    super();
  }
  public NonvalidEmailException(String message){
    super(message);
  }
  public NonvalidEmailException(String message , Throwable cause){
    super(message, cause);
  }
}
