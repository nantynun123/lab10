package project1package;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	public void test() {
		 projectfunctions project = new projectfunctions();
	 String result = project.addStrings("capstone", "project");
         assertEquals("capstoneproject", result);
	}

}
