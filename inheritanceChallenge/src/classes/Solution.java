package classes;
/* Author: HackerRank (this class was provided in the challenge)
 * Date: 2021-01-29
 * Description: This is the run file to calculate the students grade
 *              The user input should be in the format:
 *                      Line 1: A string in the format "first name last name 7-digit id number"
 *                      Line 2: The number of grades
 *                      Line 2: Space separated integers between 0 - 100 for the grades
 */
import java.util.*; // Import scanner
public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // Initialize scanner
		String firstName = scan.next();         // Take input for first name
		String lastName = scan.next();          // Take input for last name
		int id = scan.nextInt();                // Take input for student id (7-digits)
		int numScores = scan.nextInt();			// Take input for number of scores
		int[] testScores = new int[numScores];	// Initialize array of test scores
		
		// Take input for test scores 
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close(); 
			
		// Create an instance of the student class
		Student s = new Student(firstName, lastName, id, testScores);
		
		// Call print method from the person class
		s.printPerson();
		
		// Print grade
		System.out.println("Grade: " + s.calculate() );
	}
}
