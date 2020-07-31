package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] array = new String[5];
		// 2. print the third element in the array
		System.out.println(array[2]);
		// 3. set the third element to a different value
		array[2] = "different value";
		// 4. print the third element again
		System.out.println(array[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array.length);
		}
		// 6. make an array of 50 integers
		Integer[] intarray = new Integer[50];
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < intarray.length; i++) {
			Random rand = new Random();
			int randint = rand.nextInt(50);
			intarray[i] = randint;
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
			int minimum = intarray[0];
			for (int i = 0; i < intarray.length; i++) {
				if (minimum > intarray[i]) {
					minimum = intarray[i];
				}
			}
		// 9 print the entire array to see if step 8 was correct
		System.out.println(intarray.length);
		// 10. print the largest number in the array.
	}
}
