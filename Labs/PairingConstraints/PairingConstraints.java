import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;


class Bear {
// TODOBEGIN(EE422C)
// TODOEND(EE422C)
}

@Target(TYPE)
@Retention(RUNTIME)
//TODO(EE422C): update these to your name and eid
@interface Author {
  public String name() default  "John Snow" ;
  public String uteid() default  "js123" ;
}


//TODO(EE422C): update these to your name and eid
@Author(name="John Snow", uteid="js123")
public class PairingConstraints {

//TODO(EE422C): implement your helper functions here
// TODOBEGIN(EE422C)
// TODOEND(EE422C)

  public static String [] solveFromFile( String filename ) {
    // TODOBEGIN(EE422C)
    return new String[]{"Pat + Jack the Great"};
    // TODOEND(EE422C)
  }

  public static String [] solveFromStringArray( String[] data ) {
    // TODOBEGIN(EE422C)
    return new String[]{"Pat + Jack the Great"};
    // TODOEND(EE422C)
  }
  

}
