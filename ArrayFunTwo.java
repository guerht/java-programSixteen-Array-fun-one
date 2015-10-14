/*
 * Project: ArrayFunTwo.java
 * Description: Learning more about arrays
 * Author: Seunghoon Park
 * Date: 14 October, 2015
 */
class ArrayFunTwo {
	public static void main(String args[]) {
		int a[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		int total = 0;
		for(int i : a) {
			total += i;
			System.out.println("Sum now is: " + total);
		}
		System.out.println();
		int b[] = {3, 5, 6, 8, 8, 10, 22};
		int sum = 0;
		int count = 0;
		for (int i : b) {
			sum += i;
			count++;
		}
		System.out.println("Sum is: " + sum);
		System.out.println("Average is: " + (double)sum/count);
	}
}