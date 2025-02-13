package RetrylogicDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	
	//counter to keep track of retry  attempt	
	int counterForRetryAttempt = 0;
    int  setMaxlimiforRetry =3;
    
    //method to retry failed  test case
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(counterForRetryAttempt<setMaxlimiforRetry) {
			counterForRetryAttempt++;
			return true;
		}
		
		return false;
	}

}
