package org.day5juit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Testresult {
	
	public void testresult() {
		
		Result t1 = JUnitCore.runClasses(hotel_junitproject.class,practicjunittt2.class);
		
		System.out.println("Runcount..."+t1.getRunCount());
		System.out.println("failure count...."+t1.getFailureCount());
		System.out.println("ignorecount..."+t1.getIgnoreCount());
		System.out.println("run time..."+t1.getRunTime());
		
		
		List<Failure> f1 = t1.getFailures();
		
		for(Failure x:f1) {
			System.out.println(x);
			System.out.println(x.getMessage());
			System.out.println(x.getTestHeader());
			System.out.println(x.getException());
			System.out.println("...............");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
