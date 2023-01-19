package com.hakanboranbay.housetypes;

import java.util.ArrayList;

public class SummerHouse extends House {
	
	ArrayList<SummerHouse> summerHauseList = new ArrayList<>();
	
	public SummerHouse(float price, int squareMeter, int roomNumber, int livingRoomNumber) {
		if (price < 0 || squareMeter <= 0 || roomNumber <= 0 || livingRoomNumber < 0) {
			return;
		}
		this.price = price;
		this.squareMeter = squareMeter;
		this.roomNumber = roomNumber;
		this.livingRoomNumber = livingRoomNumber;
	}

}
