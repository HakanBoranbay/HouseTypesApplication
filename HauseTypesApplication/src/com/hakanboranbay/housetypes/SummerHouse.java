package com.hakanboranbay.housetypes;

/**
 * A class that extends House abstract class and represent the summer house type.
 * @author hakanboranbay
 *
 */
public class SummerHouse extends House {
	
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
