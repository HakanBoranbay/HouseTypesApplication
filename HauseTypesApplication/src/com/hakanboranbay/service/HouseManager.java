package com.hakanboranbay.service;

import java.util.LinkedHashSet;

import com.hakanboranbay.housetypes.House;
import com.hakanboranbay.main.Houses;

/**
 * House manager class implements house service interface and involves:
 * methods to get total prices of flats, villas, summer houses and all houses,
 * methods to get total square meters of flats, villas, summer houses and all houses,
 * and method to get a house by its room and living room numbers.
 * @author hakanboranbay
 *
 */
public class HouseManager implements IHouseService {
	
	Houses houses = new Houses();

	@Override
	public float getTotalHousePrices() {
		return getTotalPrice(houses.getHauseList());
	}

	@Override
	public float getTotalFlatPrices() {
		return getTotalPrice(houses.getFlatList());
	}

	@Override
	public float getTotalVillaPrices() {
		return getTotalPrice(houses.getVillaList());
	}

	@Override
	public float getTotalSummerHousePrices() {
		return getTotalPrice(houses.getSummerHauseList());
	}

	@Override
	public double getAverageSquareMeterOfAllHouses() {
		return getAverageSquaremeter(houses.getHauseList());
	}

	@Override
	public double getAverageSquareMeterOfFlats() {
		return getAverageSquaremeter(houses.getFlatList());
	}

	@Override
	public double getAverageSquareMeterOfVillas() {
		return getAverageSquaremeter(houses.getVillaList());
	}

	@Override
	public double getAverageSquareMeterOfSummerHouses() {
		return getAverageSquaremeter(houses.getSummerHauseList());
	}
	
	@Override
	public LinkedHashSet<House> getHouseByRoomNumbers(int roomNumber, int LivingRoomNumber) {
		LinkedHashSet<House> houseList = new LinkedHashSet<>();
		LinkedHashSet<House> mainList = houses.getHauseList();
		for (House house : mainList) {
			if (house.getRoomNumber() == roomNumber && house.getLivingRoomNumber() == LivingRoomNumber) {
				houseList.add(house);
			}
		}
		return houseList;
	}
	
	private float getTotalPrice(LinkedHashSet<House> list) {
		float totalPrice = 0;
		for (House house : list) {
			totalPrice += house.getPrice();
		}
		return totalPrice;
	}
	
	private double getAverageSquaremeter(LinkedHashSet<House> list) {
		int totalSquareMeter = 0;
		int counter = 0;
		for (House house : list) {
			totalSquareMeter += house.getSquareMeter();
			counter++;
		}
		return (totalSquareMeter / (double)counter);
	}

}
