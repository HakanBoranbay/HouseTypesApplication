package com.hakanboranbay.housetypes;

/**
 * A class that extends House abstract class and represent the flat type.
 * @author hakanboranbay
 *
 */
public class Flat extends House {

	public Flat(float price, int squareMeter, int roomNumber, int livingRoomNumber) {
		if (price < 0 || squareMeter <= 0 || roomNumber <= 0 || livingRoomNumber < 0) {
			return;
		}
		this.price = price;
		this.squareMeter = squareMeter;
		this.roomNumber = roomNumber;
		this.livingRoomNumber = livingRoomNumber;
	}
	
}
