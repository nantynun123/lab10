package project1package;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void test() {
	   projectfunctions project = new projectfunctions();
	      int result = project.addnumbers(200,300);
	    	assertEquals (500, result);	  
	}
	

}
