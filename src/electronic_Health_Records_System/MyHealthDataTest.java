/*
 * File Name: MyHealthDataBase.java
 * Author: Mengying Liu, student No. 041086143
 * Course: CST8285 - OOP
 * Assignment: Assignment 1
 * Due data: Oct 15th, 2023
 * Professor: Islam Gomaa
 */
package electronic_Health_Records_System;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * MyHealthDataTest is a driver class to be used for instance initiating.
 * 
 * @author Mengying Liu
 * @version 1.0
 * @since 17.0.7
 * @see MyHealthData
 * @see MyHealthDataBase
 * @see java.time.LocalDate
 * @see java.util.Scanner
 */
public class MyHealthDataTest {

	/**
	 * The main method is the entry point for the program.
	 * 
	 * @param args The command-line arguments passed to the program.
	 */
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter patient's first Name:");
		String firstName = keyboard.nextLine();

		System.out.println("Please enter patient's last Name:");
		String lastName = keyboard.nextLine();

		System.out.println("Please enter patient's sex:");
		String gender = keyboard.nextLine();

		System.out.println("Please enter patient's year of birth(4 digits):");
		int birthYear = keyboard.nextInt();

		System.out.println("Please enter patient's Height(in inches):");
		double height = keyboard.nextDouble();

		System.out.println("Please enter patient's Weight(in pounds):");
		double weight = keyboard.nextDouble();

		/*
		 * It follows the online examples from JavaTPoint - Java LocalDate class
		 * https://www.javatpoint.com/java-localdate
		 */
		LocalDate today = LocalDate.now();
		int currentYear = today.getYear();

		MyHealthData patient = new MyHealthData(firstName, lastName, gender, height, weight, birthYear, currentYear);

		patient.displayMyHealthData();

		keyboard.close();
	}

}
