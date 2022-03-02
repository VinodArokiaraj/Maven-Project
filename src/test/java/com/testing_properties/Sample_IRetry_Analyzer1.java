package com.testing_properties;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Sample_IRetry_Analyzer1 implements IRetryAnalyzer {

	int start = 0;
	
	int end = 3;
	
	@Override
	public boolean retry(ITestResult result) {

		if (start<=end) {
			
			start++;
			
			return true;
		}
		
		return false;
	}
	
}
