package com.jenkins.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Task {
	@Test
	public void testTask() {
		Reporter.log("testTask",true);
	}

}
