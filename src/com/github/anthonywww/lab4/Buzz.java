package com.github.anthonywww.lab4;

/**
 * Some string example
 *
 * @author Anthony Waldsmith https://github.com/anthonywww
 * @version 2/06/2018
 */
public class Buzz {

	public static void main(String[] args) {
		zippo("rattle", 13); // 1
	}

	public static void baffle(String blimp) {
		System.out.println(blimp + blimp); // 4
	}

	public static void zippo(String quince, int flag) {
		if (flag < 0) {
			System.out.println(quince + " zoop"); // 7
		} else {
			System.out.println("ik"); // 2
			baffle(quince); // 3
			System.out.println("bwa-ha-ha"); // 5
			zippo(quince, -5); // 6
		}
	}

}
