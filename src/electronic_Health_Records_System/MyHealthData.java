/*
 * File Name: MyHealthData.java
 * Author: Mengying Liu, student No. 041086143
 * Course: CST8285 - OOP
 * Assignment: Assignment 1
 * Due date: Oct 15th, 2023
 * Professor: Islam Gomaa
 */

package electronic_Health_Records_System;

	/**
	 * MyHealthData is a class  extended from MyHeathDataBase.
	 * It contains standard constructor, getters, setters, and other methods to display MyHealthData, 
	 * @author Modified by Mengying Liu
	 * @version 1.0
	 * @since 17.0.7
	 * @see MyHealthDataBase
	 * @see MyHealthDataTest
	 */
	public class MyHealthData extends MyHealthDataBase{

	/**
	 * stores the patient's first name;	
	 */
	private String firstName;
	
	/**
	 * stores the patient's last name;	
	 */
	private String lastName;
	
	/**
	 * stores the patient's gender;	
	 */
	private String gender;
	
	/**
	 * stores the patient's birth year;	
	 */
	private int birthYear;
	
	/**
	 * stores current year;	
	 */
	private int currentYear;
	
	/**
	 * stores the patient's height;	
	 */
	private double height;
	
	/**
	 * stores the patient's weight;	
	 */
	private double weight;

	/**
	 * Constructs a new patient object with the given data
	 * @param firstName Patient's first name
	 * @param lastName Patient's last name
	 * @param gender Patient's gender
	 * @param height Patient's height
	 * @param weight Patient's weight
	 * @param birthYear Patient's birth year
	 * @param currentYear Current year 
	 */
	public MyHealthData(String firstName, String lastName, String gender, 
			double height, double weight, int birthYear, int currentYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
	}

	/**
     * Gets the first name of the patient.
     * @return The first name of the patient.
     */
	public String getFirstName() {
		return firstName;
	}

	/**
     * Sets the first name of the person.
     * @param firstName: The new first name for the patient.
     */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
     * Gets the last name of the patient.
     * @return The last name of the patient.
     */
	public String getLirstName() {
		return lastName;
	}

	/**
     * Sets the new last name of the person.
     * @param lastName: The new last name for the patient.
     */
	public void setLirstName(String lastName) {
		this.lastName = lastName;
	}

	/**
     * Gets the gender of the patient.
     * @return The gender of the patient.
     */
	public String getGender() {
		return gender;
	}

	/**
     * Sets the new gender of the person.
     * @param gender: The new gender for the patient.
     */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
     * Gets the birth year of the patient.
     * @return The birth year of the patient.
     */
	public int getBirthYear() {
		return birthYear;
	}

	/**
     * Sets the new birth year of the patient.
     * @param birthYear the new birth year of the patient.
     */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
     * Gets the height of the patient.
     * @return The height of the patient.
     */
	public double getHeight() {
		return height;
	}

	/**
     * Sets the new height of the patient.
     * @param height the new height of the patient.
     */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
     * Gets the weight of the patient.
     * @return The weight of the patient.
     */
	public double getWeight() {
		return weight;
	}

	/**
     * Sets the new weight of the patient.
     * @param weight the new weight of the patient.
     */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * This method returns the age .
	 * @return this number represents the calculated age.
	 */
	public int getAge() {
		return currentYear - birthYear;
	}
	
	/**
	 * This method returns the max heart rate .
	 * @return this number represents the calculated max heart rate.
	 */
	public int getMaximumHeartRate() {
		return 220 - getAge();
	}
	
	/**
	 * This method returns the max heart rate .
	 * @return this number represents the calculated max target heart rate.
	 */
	public double getMaxTargetHeartRate() {
		return 0.85 * getMaximumHeartRate();
	}

	/**
	 * This method returns the min heart rate .
	 * @return this number represents the calculated min target heart rate.
	 */
	public double getMinTargetHeartRate() {
		return 0.5 * getMaximumHeartRate();
	}
	
	/**
	 * This method shows all heath data.
	 */
	public void displayMyHealthData() {
		System.out.printf(
				"Patient's first name: %s%n"
				+ "Patient's last name: %s%n"
				+ "Patient's sex: %s%n"
				+ "Patient's year of birth: %d%n"
				+ "Patient's height: %.2f%n"
				+ "Patient's weight: %.2f%n"
				+ "Patient's age in years: %d%n"
				+ "Patient's BMI: %.2f%n"
				+ "Patient's maximum heart rate: %d%n"
				+ "Patient's target heart rate range: %.2f to %.2f%n%n", 
				firstName,lastName, gender,birthYear,height,weight,
				getAge(), 
				calculateBMI(weight,height),
				getMaximumHeartRate(), 
				getMinTargetHeartRate(),
				getMaxTargetHeartRate());

		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
	}

} // end class MyHealthData

	