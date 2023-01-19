package com.hakanboranbay.service;

import java.util.ArrayList;

import com.hakanboranbay.housetypes.House;
import com.hakanboranbay.main.Houses;

public class HouseManager implements IHouseService {
	
	Houses houses;

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
	public ArrayList<House> getHouseByRoomNumbers(int roomNumber, int LivingRoomNumber) {
		ArrayList<House> houseList = new ArrayList<>();
		ArrayList<House> mainList = houses.getHauseList();
		for (House house : mainList) {
			if (house.getRoomNumber() == roomNumber && house.getLivingRoomNumber() == LivingRoomNumber) {
				houseList.add(house);
			}
		}
		return houseList;
	}
	
	private float getTotalPrice(ArrayList<House> list) {
		float totalPrice = 0;
		for (House house : list) {
			totalPrice += house.getPrice();
		}
		return totalPrice;
	}
	
	private double getAverageSquaremeter(ArrayList<House> list) {
		int totalSquareMeter = 0;
		int counter = 0;
		for (House house : list) {
			totalSquareMeter += house.getSquareMeter();
			counter++;
		}
		return (totalSquareMeter / (double)counter);
	}

}
