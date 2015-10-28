/*
 * Project: ParallelArrays.java
 * Description: Using parallel Arrays and Array Methods
 * Author: Seunghoon Park
 * Date: 28 October, 2015
 */
import java.util.Scanner;
import java.util.Arrays; // allows sorting
// import java.util.ArrayList; // dynamic arrays
public class ParallelArrays {
	public static void printSplit (String[] split, String s) {
		System.out.println("Split String \"" + s + "\" is now: ");
		for (int i = 0; i<split.length; i++) {
			System.out.print(split[i] + ", "); 
		}
		System.out.println("\n========================");
	}
	public static void main(String args[]) {
		// input names + grades
		int numStudents = 4;
		String name[] = new String[numStudents];
		int grade[] = new int[numStudents];
		for(int i = 0; i < numStudents; i++) {
			Scanner scanName = new Scanner(System.in); // names	
				System.out.println("Enter the student name: ");
				name[i] = scanName.nextLine();
			Scanner scanGrade = new Scanner(System.in); // grades
				System.out.println("Enter the student grade: ");
				grade[i] = scanGrade.nextInt();
		}
		System.out.println("\nGRADEBOOK WIZARD\n========================");
		//print names + grades
		for(int i = 0; i < numStudents; i++) {
			System.out.print(name[i] + ":\t" + grade[i]);
			System.out.println();
		}
		System.out.println();
		/* int[] x, y, z // ALL are arrays
		 * int x[], y, z // only X is array*/
		//split strings into arrays
		String s = "Hello again", sp[];
		sp = s.split("a"); // sp[0] = "Hello "; sp[1] = "g"; sp[2] = "in";
		printSplit(sp, s);
		sp = s.split("\\s"); // split the white space
		printSplit(sp, s);
		sp = s.split("e|g"); // splits e OR g
		printSplit(sp, s);
		sp = s.split("a|g"); // has some blank elements
		printSplit(sp, s);
		sp = s.split("el|ai");
		printSplit(sp, s);
	}
}