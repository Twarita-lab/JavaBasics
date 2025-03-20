package hackerRank;

import java.util.Scanner;

public class CombineSplit {

	public static void main(String[] args) {
		/*
		 * S;M;camelCasedWord() - Split, delete (); starts with lower case
		 * S;C;camelCasedWord - Split, starts with lower case S;V;camelCasedWord -
		 * Split, starts with lower case C;M;splitted words starting with lower case -
		 * combine. make camelCase, add () C;C;splitted words starting with lower case -
		 * combine. make camelCase & if 1st letter is LowerCase make it upper case
		 * C;V;splitted words starting with lower case - combine. make camelCase
		 */

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String input = scan.nextLine();
			if (input.charAt(0) != ' ') {
				StringBuffer output = new StringBuffer();
				String[] inputArray = input.split(";");
				StringBuffer actualInput = new StringBuffer();
				actualInput.append(inputArray[2]);
				for (int i = 0; i < actualInput.length(); i++) {

					if (input.startsWith("S")) {

						if (Character.isAlphabetic(actualInput.charAt(i))) {
							if (Character.isUpperCase(actualInput.charAt(i))) {
								if (actualInput.charAt(i) != inputArray[2].charAt(0)) {
									output.append(" ");
								}
								output.append(Character.toLowerCase(actualInput.charAt(i)));
							}

							else {
								output.append(actualInput.charAt(i));
							}
						}
					}

					else if (input.startsWith("C")) {
						if (inputArray[1].equalsIgnoreCase("C") && Character.isLowerCase(actualInput.charAt(0))) {
							actualInput.replace(0, 1, String.valueOf(Character.toUpperCase(actualInput.charAt(0))));
						}
						if (Character.isLetter(actualInput.charAt(i))) {
							output.append(actualInput.charAt(i));
						} else if (actualInput.charAt(i) == ' ') {
							actualInput.replace(i + 1, i + 2,
									String.valueOf(Character.toUpperCase(actualInput.charAt(i + 1))));
						}

					} else
						System.out.println("Error! Wrong operation");
				}
				if (inputArray[0].equalsIgnoreCase("C") && inputArray[1].equalsIgnoreCase("M")) {
					output.append("()");
				}
				System.out.println(output);
				actualInput.delete(0, actualInput.length());
			} else {
				scan.close();
				break;
			}
		}

	}
}