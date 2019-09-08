package com.abhishek.practice.assignments;

public class DisplayMultiplication {
	public static void main(String[] args) {
		displayMultiplicationMatrix();
	}
	
	static void displayMultiplicationMatrix() {
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 13; j++) {
				if(j == 0) {
					System.out.print("\t" + (i+j));
				} else if(i == 0) {
					System.out.print("\t" + (i+j));
				} else {
					System.out.print("\t" + i*j);
				}
			}
			System.out.println("");
		}
	}
}
