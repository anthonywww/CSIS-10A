package com.github.anthonywww.assignment8;

/**
 * Coding Bat Tests
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 3/05/2018
 */
public class CodingBatTurnIn {

	public static void main(String[] args) {

	}

	// Part 1

	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public String extraEnd(String str) {
		return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
	}

	public boolean frontAgain(String str) {
		if (str.length() < 2) {
			return false;
		}
		String first = str.substring(0, 2);
		String last = str.substring(str.length() - 2);
		return first.equals(last);
	}

	// Part 2

	public String doubleChar(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i)).append(str.charAt(i));
		}
		return sb.toString();
	}

	public int countHi(String str) {
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
				count++;
			}
		}

		return count;
	}

	public boolean xyBalance(String str) {
		int xPos = 0;
		int yPos = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x') {
				xPos = i + 1;
			} else if (str.charAt(i) == 'y') {
				yPos = i + 1;
			}
		}

		return xPos <= yPos;
	}

	public String repeatEnd(String str, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i < n; i++) {
			sb.append(str.substring(str.length()-n));
		}
		return sb.toString();
	}
	
	

}
