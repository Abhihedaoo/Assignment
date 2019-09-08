package com.abhishek.practice.assignments;

public class ElectricityBill {
	public static void main(String[] args) {
		System.out.println("Total Bill :: " + billCalcultator(true, 350));
		System.out.println("Total Bill :: " + billCalcultator(false, 350));
	}
	
	static float billCalcultator(boolean isCommercial, int unitConsumed) {
		float totalBill = 0.0f;
		
		if(isCommercial) {
			if (unitConsumed <= 100) {
				totalBill = unitConsumed * 4.25f;
			} else if (unitConsumed > 100 && unitConsumed <=300) {
				totalBill = unitConsumed * 4.75f;
			} else if (unitConsumed > 300 && unitConsumed <= 500) {
				totalBill = unitConsumed * 5;
			} else if (unitConsumed > 500) {
				totalBill = unitConsumed * 5.25f;
			}
		} else {
			if (unitConsumed <= 100) {
				totalBill = unitConsumed * 4;
			} else if (unitConsumed > 100 && unitConsumed <=300) {
				totalBill = unitConsumed * 4.5f;
			} else if (unitConsumed > 300 && unitConsumed <= 500) {
				totalBill = unitConsumed * 4.75f;
			} else if (unitConsumed > 500) {
				totalBill = unitConsumed * 5;
			}
		}
		return totalBill;
	}
	
}


