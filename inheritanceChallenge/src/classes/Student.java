package classes;
/* Author: Sarah Spence
 * Date: 2021-01-29
 * Description: This class inherits firstName, lastName, and ID from the person class
 *              Next, it defines a method to calculate the student's average score and assigns it to
 *              the corresponding letter grade. The method returns the student's letter grade. 
 */

public class Student extends Person {
	private int[] testScores;

	/*
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    public Student(String firstName, String lastName, int id, int[] testScores){
      super(firstName, lastName, id);
      this.testScores = testScores;   
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        char grade = 'T';   // Initialize empty char 
        int sum = 0;        // Initialize sum
        double average;     // Initialize average 
        
        // Calculate sum of scores
        for (int score : testScores){
            sum += score;
        }
        average = sum/testScores.length;
        
        // Determine letter grade
        if(average >= 90 && average <= 100) {
            grade = 'O';
        } 
        else if (average >= 80 && average < 90) {
            grade = 'E';
        }
        else if (average >= 70 && average < 80){
            grade = 'A';
        }
        else if (average >= 55 && average < 70){
            grade = 'P';
        }
        else if (average >= 40 && average < 55){
            grade ='D';
        }
        else if (average < 40) {
            grade ='T';
        }
        return grade;
    }
}

