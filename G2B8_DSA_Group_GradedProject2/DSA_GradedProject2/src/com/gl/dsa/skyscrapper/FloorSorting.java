package com.gl.dsa.skyscrapper;

import java.util.Stack;

public class FloorSorting {
	private Stack<Integer> floorSize = new Stack<>();
	public FloorSorting() {
		System.out.println("\n The Order of Floor setting is :");
	}
	public void Floor(int givenSize, int[] floorSizes) {
		for(int i = 0; i < floorSizes.length; i++) {
			int day = i + 1;
			System.out.println("\n\nDay: " + day);
			if(floorSizes[i] !=  givenSize) {
				System.out.print(" ");
				floorSize.push(floorSizes[i]);
			}else {
				givenSize -= 1;
				System.out.print(floorSizes[i] + " ");
				while(!floorSize.isEmpty() && givenSize == floorSize.peek()) {
					givenSize -= 1;
					System.out.print(floorSize.pop() + " ");
				}
			}
		}
	}

}
