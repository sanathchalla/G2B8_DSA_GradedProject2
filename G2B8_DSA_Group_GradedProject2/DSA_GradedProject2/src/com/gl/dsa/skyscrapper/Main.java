package com.gl.dsa.skyscrapper;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nThe Total Floors in the Building:");
		
		int totalfloors = sc.nextInt();
		
		int[] floorSizes = new int[totalfloors];
		
		for (int i = 0; i < floorSizes.length; i++) {
			int Day = i + 1;
			System.out.println("Enter the floor size given on Day :" + Day);
			int size = sc.nextInt();
			if(size <= 0) {
				System.out.println("\nFloor size not valid");
				i--;
			}
			else if (size > totalfloors) {
				System.out.println("\nFloor size not valid");
				i--;
			}else {
				floorSizes[i] = size;
			}
	
		}
		FloorSorting f = new FloorSorting();
		f.Floor(totalfloors, floorSizes);
		sc.close();
	}

}
