/*
 * Project: Array2DFunTwo.java
 * Description: Learning 2D arrays no.2
 * Author: Seunghoon Park
 * Date: 14 October, 2015
 */
class Array2DFunTwo {
	public static String Capitalize(String str) {
		return str.substring(0,1).toUpperCase() + str.substring(1);
	}
	public static void main(String args[]) {
		String a[][] = {
			{"crust", "original", "thin", "deep dish"},
			{"toppings", "cheese", "olives", "pepperoni", "potatoes", "peppers", "onions", "anchovies", "bbq chicken", "beef"},
			{"extras", "sweet potato mousse", "coke", "cider", "parmesan", "hot sauce", "garlic dipping sauce"}
		};
		System.out.println("Welcome to Papa John's Pizza! Can I take your order?");
		System.out.println("Here are your choices: ");
		for(int i = 0; i < a.length; i++) { // run through the ROWS (3)
			for(int j = 0; j < a[i].length; j++) { // run through the COLUMNS (various)
				if(j == 0) {
					System.out.println(Capitalize(a[i][j]) + " choices: ");
				}
				else {
					System.out.print(j + ") " + Capitalize(a[i][j]) + ", ");
				}
			}
			System.out.println("\n");
		}
	}
}