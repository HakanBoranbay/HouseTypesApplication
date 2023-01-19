package com.hakanboranbay.hausetypes;

import java.util.ArrayList;

public class SummerHause extends Hause {
	
	ArrayList<SummerHause> summerHauseList = new ArrayList<>();
	
	public SummerHause(float price, int squareMeter, int roomNumber, int livingRoomNumber) {
		if (price < 0 || squareMeter <= 0 || roomNumber <= 0 || livingRoomNumber < 0) {
			return;
		}
		this.price = price;
		this.squareMeter = squareMeter;
		this.roomNumber = roomNumber;
		this.livingRoomNumber = livingRoomNumber;
	}

}
