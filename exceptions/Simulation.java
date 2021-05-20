package dev.carbajal.exceptions;

import java.util.Scanner;

public class Simulation {

	public static void main(String[] args) {

		try {

			getInput();

		} catch (EvenNumberException e) {

			e.printStackTrace();

		} 

	}

	public static void getInput() throws EvenNumberException {

		Scanner in = new Scanner(System.in);

		// Getting user input

		System.out.println("Type in a number and press Enter...");
		String line = in.nextLine();
		System.out.println("You've typed: " + line);

		//test if number is even, throw exception if true

		if (isEven(line)) {

			try {

				throw new EvenNumberException();

			} catch (EvenNumberException e) {

				e.printStackTrace();

			} finally {

				in.close();

			}

		}

		// Close scanner resource

		in.close();

	}

	public static boolean isEven(String num) {

		// Convert value to a number

		int value = Integer.parseInt(num);

		return (value % 2 == 0);
	}

}
