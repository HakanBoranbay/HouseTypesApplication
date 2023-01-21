package com.hakanboranbay.service;

import java.util.LinkedHashSet;

import com.hakanboranbay.housetypes.House;

/**
 * House manager interface.
 * @author hakanboranbay
 *
 */
public interface IHouseService {
	
	float getTotalHousePrices();
	float getTotalFlatPrices();
	float getTotalVillaPrices();
	float getTotalSummerHousePrices();
	double getAverageSquareMeterOfAllHouses();
	double getAverageSquareMeterOfFlats();
	double getAverageSquareMeterOfVillas();
	double getAverageSquareMeterOfSummerHouses();
	LinkedHashSet<House> getHouseByRoomNumbers(int roomNumber, int LivingRoomNumber);
	
}
