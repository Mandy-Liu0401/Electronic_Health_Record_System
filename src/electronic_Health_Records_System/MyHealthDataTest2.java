/*
 * File Name: MyHealthDataTest2.java
 * Author: Mengying Liu, student No. 041086143
 * Course: CST8285 - OOP
 * Assignment: Assignment 1
 * Due data: Oct 15th, 2023
 * Professor: Islam Gomaa
 */
package electronic_Health_Records_System;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class MyHealthDataTest2 {

	double tolerance = 0.01;
	/*
	 * Test method for {@link assignment1.MyHealthDataBase#calculateBMI(double, double)}.
	 */
	@Test
	public void testCalculateBMI() {
        double expectedBMI = 27.26;
    	MyHealthData person = new MyHealthData("mengying", "liu", "male", 70, 190, 1989, 2023);
        double result = person.calculateBMI(190, 70);
        Assert.assertEquals( expectedBMI, result, tolerance);
	}

	/*
	 * Test method for {@link assignment1.MyHealthDataBase#incorrectBMI(double, double)}.
	 * incorrectBMI()equation is multiplied by 10 on purpose, which makes calculation
	 * result 10 times bigger than expected result.
	 */
	@Test
	public void testIncorrectBMI() {
		double expectedBMI = 27.26;
		MyHealthData person = new MyHealthData("mengying", "liu", "male", 70, 190, 1989, 2023);
		double result = person.incorrectBMI(190, 70);
		Assert.assertEquals( expectedBMI, result, tolerance);
	}

}
