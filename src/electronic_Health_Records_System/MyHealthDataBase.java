/*
 * File Name: MyHealthDataBase.java
 * Author: Mengying Liu, student No. 041086143
 * Course: CST8285 - OOP
 * Assignment: Assignment 1
 * Due data: Oct 15th, 2023
 * Professor: Islam Gomaa
 */
package electronic_Health_Records_System;

/**
 * MyHealthDataBase is a base class to be extended for the Electronic Health
 * Records (EHR) System, also known as Assignment 1. It contains a method to
 * calculate BMI and will contain other methods.
 * 
 * @author Modified by Mengying Liu
 * @version 1.0
 * @since 17.0.7
 * @see MyHealthData
 * @see MyHealthDataTest
 */
public class MyHealthDataBase {
	/**
	 * This method returns the calculated Body Mass Index (BMI) from data provided.
	 * 
	 * @param weightParam Weight of the patient in pounds.
	 * @param heightParam Height of the patient in inches.
	 * @return this number represents the calculated BMI
	 */
	
	public double calculateBMI(double weightParam, double heightParam) {
		return weightParam * 703 / (heightParam * heightParam);
	}
	/**
	 * This method returns the calculated Body Mass Index (BMI) from data provided.
	 * the result is 10 times bigger than actual BMI.
	 * 
	 * @param weightParam Weight of the patient in pounds.
	 * @param heightParam Height of the patient in inches.
	 * @return this number represents a wrong calculated BMI
	 */
	public double incorrectBMI(double weightParam, double heightParam) {
		return weightParam * 7030 / (heightParam * heightParam);//multiplied by 10 to test
		
	}
	

	

}