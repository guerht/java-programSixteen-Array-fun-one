/*
 * Project: Marbles.java
 * Description: A String array containing the names of marble colours
 * Author: Seunghoon Park
 * Date: 13 October, 2015
 */
class Marbles {
	public static void main(String args[]) {
		String bag[] = new String[4];
		bag[0] = "maroon";
		bag[1] = "red";
		bag[2] = "green";
		bag[3] = "#FE0000";
		for(int i = 0; i < bag.length; i++) {
			System.out.println(bag[i]);
		}
	}
}