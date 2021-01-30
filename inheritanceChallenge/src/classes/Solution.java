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
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
			
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
