package com.hakanboranbay.main;

import com.hakanboranbay.service.HouseManager;

public class Driver {

	public static void main(String[] args) {
		
		HouseManager houseManager = new HouseManager();

		// Method that return the total price of all houses.
		System.out.println(houseManager.getTotalHousePrices());

		// Method that return the total price of all flats.
		System.out.println(houseManager.getTotalFlatPrices());
		
		// Method that return the total price of all villas.
		System.out.println(houseManager.getTotalVillaPrices());
		
		// Method that return the total price of all summer houses.
		System.out.println(houseManager.getTotalSummerHousePrices());	

		// Method that return the average square meter of all houses.
		System.out.println(houseManager.getAverageSquareMeterOfAllHouses());
		
		// Method that return the average square meter of all flats.
		System.out.println(houseManager.getAverageSquareMeterOfFlats());
		
		// Method that return the average square meter of all villas.
		System.out.println(houseManager.getAverageSquareMeterOfVillas());
		
		// Method that return the average square meter of all summer houses.
		System.out.println(houseManager.getAverageSquareMeterOfSummerHouses());
		
		// Method that returns the list of houses that have the same amount off rooms and living rooms.
		System.out.println(houseManager.getHouseByRoomNumbers(4, 1));
		
	}
	
}
