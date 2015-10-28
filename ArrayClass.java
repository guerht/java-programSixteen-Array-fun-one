/*
 * Project: ArraysClass.java
 * Description: Working with Arrays class
 * Author: Seunghoon Park
 * Date: 28 October, 2015
 */
import java.util.Arrays;
public class ArrayClass {
	public static void printArray(int[] a) {
		System.out.print("Array: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}
	public static void main(String args[]) {
		int b[] = {1,4,-3,255,17,84,-127};
		Arrays.sort(b);
		printArray(b);

		int index = Arrays.binarySearch(b, 17);
		System.out.println("\n17 is index: " + index);

		int x[] = {1,2,3,4,5};
		int y[] = {1,2,3,4,5};
		System.out.println(Arrays.equals(x, y));
		System.out.println(Arrays.equals(x, b));

		Arrays.fill(b, 17);
		printArray(b);
	}
}