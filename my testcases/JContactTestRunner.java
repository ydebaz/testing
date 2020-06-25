import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JContactTestRunner {
//JContactTestSuite s= new JContactTestSuite();
public static void main(String[]args) {
	 Result result = JUnitCore.runClasses(JContactTestSuite.class);

    
		
     System.out.println(result.wasSuccessful());
	
}
}
