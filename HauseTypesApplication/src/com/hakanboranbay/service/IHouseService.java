package com.hakanboranbay.service;

import java.util.ArrayList;

import com.hakanboranbay.housetypes.House;

public interface IHouseService {
	
	float getTotalHousePrices();
	float getTotalFlatPrices();
	float getTotalVillaPrices();
	float getTotalSummerHousePrices();
	double getAverageSquareMeterOfAllHouses();
	double getAverageSquareMeterOfFlats();
	double getAverageSquareMeterOfVillas();
	double getAverageSquareMeterOfSummerHouses();
	ArrayList<House> getHouseByRoomNumbers(int roomNumber, int LivingRoomNumber);
	
}
